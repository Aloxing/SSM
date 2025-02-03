package com.cn.exception.tt;

public class BusinessExceptionTT extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    
    public BusinessExceptionTT(String message, Integer code) {
        super(message);
        this.code = code;
    }


    public BusinessExceptionTT(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }
}
