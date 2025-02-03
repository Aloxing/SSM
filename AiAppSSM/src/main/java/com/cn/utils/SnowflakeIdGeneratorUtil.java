package com.cn.utils;

public class SnowflakeIdGeneratorUtil {
    // 起始时间戳，可自定义，例如 2025-01-01 00:00:00 的时间戳
    private final long startTimeStamp = 1735689600000L;

    // 数据中心 ID 所占的位数
    private final long dataCenterIdBits = 5L;
    // 机器 ID 所占的位数
    private final long workerIdBits = 5L;
    // 序列号所占的位数
    private final long sequenceBits = 12L;

    // 数据中心 ID 最大值
    private final long maxDataCenterId = -1L ^ (-1L << dataCenterIdBits);
    // 机器 ID 最大值
    private final long maxWorkerId = -1L ^ (-1L << workerIdBits);
    // 序列号最大值
    private final long sequenceMask = -1L ^ (-1L << sequenceBits);

    // 机器 ID 向左移位数
    private final long workerIdShift = sequenceBits;
    // 数据中心 ID 向左移位数
    private final long dataCenterIdShift = sequenceBits + workerIdBits;
    // 时间戳向左移位数
    private final long timestampLeftShift = sequenceBits + workerIdBits + dataCenterIdBits;

    // 数据中心 ID
    private final long dataCenterId;
    // 机器 ID
    private final long workerId;
    // 序列号
    private long sequence = 0L;
    // 上一次生成 ID 的时间戳
    private long lastTimestamp = -1L;

    /**
     * 构造函数，初始化数据中心 ID 和机器 ID
     *
     * @param dataCenterId 数据中心 ID
     * @param workerId     机器 ID
     */
    public SnowflakeIdGeneratorUtil(long dataCenterId, long workerId) {
        if (dataCenterId > maxDataCenterId || dataCenterId < 0) {
            throw new IllegalArgumentException("Data center ID can't be greater than " + maxDataCenterId + " or less than 0");
        }
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException("Worker ID can't be greater than " + maxWorkerId + " or less than 0");
        }
        this.dataCenterId = dataCenterId;
        this.workerId = workerId;
    }

    /**
     * 生成下一个唯一 ID
     *
     * @return 生成的 ID
     */
    public synchronized long nextId() {
        long currentTimestamp = System.currentTimeMillis();

        // 处理时钟回拨问题
        if (currentTimestamp < lastTimestamp) {
            throw new RuntimeException("Clock moved backwards. Refusing to generate id for " + (lastTimestamp - currentTimestamp) + " milliseconds");
        }

        if (currentTimestamp == lastTimestamp) {
            // 同一毫秒内，序列号递增
            sequence = (sequence + 1) & sequenceMask;
            if (sequence == 0) {
                // 序列号达到最大值，等待下一毫秒
                currentTimestamp = waitNextMillis(lastTimestamp);
            }
        } else {
            // 不同毫秒，序列号重置为 0
            sequence = 0L;
        }

        lastTimestamp = currentTimestamp;

        // 生成最终的 ID
        return ((currentTimestamp - startTimeStamp) << timestampLeftShift) |
                (dataCenterId << dataCenterIdShift) |
                (workerId << workerIdShift) |
                sequence;
    }

    /**
     * 等待下一毫秒
     *
     * @param lastTimestamp 上一次生成 ID 的时间戳
     * @return 下一毫秒的时间戳
     */
    private long waitNextMillis(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }
}
