package com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.domain.Users;
import com.cn.pojo.Code;
import com.cn.pojo.Result;
import com.cn.service.SignInService;
import com.cn.utils.JWTUtil;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/sign/in")
public class SignInController {

    @Autowired
    private SignInService signInService;

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping()
    public Result signInIsTrue(@Param("username") String username,@Param("password") String password) {
        Users users = signInService.signInIsTrue(username, password);
        if(users != null)
            return new Result("Bearer "+jwtUtil.generateToken(username),"登录成功",Code.GET_OK);
        return new Result(null,"用户名或密码错误",Code.GET_ERR);
    }
    

}
