package com.cn.dao;

import org.apache.ibatis.annotations.Insert;

import com.cn.domain.Users;

public interface UsersDao {

    @Insert(
        "insert into users(user_id,username,password,email,phone,full_name,role_id,status,created_at,updated_at) "+
        "values(#{userId},#{username},#{password},#{email},#{phone},#{fullName},#{roleId},#{status},#{createdAt},#{updatedAt})"
          )
    void insertUsers(Users users);
}
