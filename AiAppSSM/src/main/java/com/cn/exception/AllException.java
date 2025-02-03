package com.cn.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cn.pojo.Result;
import com.cn.exception.tt.BusinessExceptionTT;
import com.cn.pojo.Code;

@RestControllerAdvice
public class AllException {
    // @ExceptionHandler(Exception.class)
    // public Result allException(Exception e) {
    //     return new Result(null,"未知错误!",Code.UNKNOWN_STATUS);
    // }
    
    @ExceptionHandler(BusinessExceptionTT.class)
    public Result businessException(BusinessExceptionTT e){

        String msg = e.getMessage();
        Integer code = e.getCode();
        return new Result(null,msg,code);

    }

}
