package com.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.SignInDao;
import com.cn.domain.Users;
import com.cn.service.SignInService;
import com.cn.utils.MD5Util;

@Service
public class SignInServiceImpl implements SignInService {

    @Autowired
    private SignInDao signInDao;

    @Override
    public Users signInIsTrue(String username,String password){
        password = MD5Util.encrypt(password);
        return signInDao.signInIsTrue(username,password);
    }

}
