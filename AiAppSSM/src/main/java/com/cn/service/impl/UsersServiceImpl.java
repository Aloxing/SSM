package com.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.UsersDao;
import com.cn.domain.Users;
import com.cn.exception.tt.BusinessExceptionTT;
import com.cn.pojo.Code;
import com.cn.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public void insertUsers(Users users){
        try{
            usersDao.insertUsers(users);
        }catch(Exception e){
            throw new BusinessExceptionTT("用户名已存在",Code.SAVE_ERR);
        }
    }

}
