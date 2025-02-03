package com.cn.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.domain.Users;
import com.cn.pojo.Result;
import com.cn.service.UsersService;
import com.cn.utils.MD5Util;
import com.cn.utils.SnowflakeIdGeneratorUtil;

@RestController
@RequestMapping("/api/sign/up")
public class SignUpController {

    @Autowired
    private UsersService usersService;

    private SnowflakeIdGeneratorUtil snowflakeIdGeneratorUtil = new SnowflakeIdGeneratorUtil(1,1);

    @PostMapping()
    public Result postMethodName(@RequestBody Users users) {
        //TODO: process POST request

        //雪花算法生成id
        users.setUserId(snowflakeIdGeneratorUtil.nextId());
        //MD5加密
        users.setPassword(MD5Util.encrypt(users.getPassword()));

        users.setRoleId(2);
        users.setStatus((short)1);
        users.setCreatedAt(LocalDateTime.now());
        users.setUpdatedAt(LocalDateTime.now());
        
        usersService.insertUsers(users);
        
        return new Result(users,1);
    }

}
