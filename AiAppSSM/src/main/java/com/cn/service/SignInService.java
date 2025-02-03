package com.cn.service;

import com.cn.domain.Users;

public interface SignInService {
    Users signInIsTrue(String username, String password);
} 
