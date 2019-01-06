package com.bitbank.service;

import com.bitbank.common.Result;
import com.bitbank.entity.User;

/**
 * Created by bst on 2019/1/4.
 */

public interface UserService {
    Result<User> login(String username, String password);
}
