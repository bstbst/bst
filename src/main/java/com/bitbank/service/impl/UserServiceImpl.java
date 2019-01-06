package com.bitbank.service.impl;

import com.bitbank.common.Result;
import com.bitbank.dao.UserMapper;
import com.bitbank.entity.User;
import com.bitbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bst on 2019/1/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<User> login(String username, String password) {
        return null;
    }
}
