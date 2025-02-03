package com.cn.exception.tt;

public class SystemExceptionTT extends RuntimeException {

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    
    public SystemExceptionTT(String message, Integer code) {
        super(message);
        this.code = code;
    }


    public SystemExceptionTT(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    

}
