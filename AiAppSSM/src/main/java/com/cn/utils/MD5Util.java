package com.cn.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    /**
     * 对输入的字符串进行MD5加密
     * @param input 输入的字符串
     * @return 加密后的字符串
     */
    public static String encrypt(String input) {
        if (input == null) {
            return null;
        }
        return DigestUtils.md5Hex(input);
    }
}
