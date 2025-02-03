package com.cn.pojo;

public class Result {
    private Object data;
    private String msg;
    private Integer code;

    public Result(Object data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public Result(Object data, Integer code) {
        this.data = data;
        this.code = code;
    }

    public Result() { }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

}
