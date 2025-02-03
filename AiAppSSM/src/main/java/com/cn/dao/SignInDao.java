package com.cn.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cn.domain.Users;

public interface SignInDao {

    @Select("select * from users where username = #{username} and password = #{password}")
    Users signInIsTrue(@Param("username") String username, @Param("password") String password);

}
