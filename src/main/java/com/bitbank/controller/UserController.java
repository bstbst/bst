package com.bitbank.controller;

import com.bitbank.common.Result;
import com.bitbank.entity.User;
import com.bitbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by bst on 2019/1/4.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/login")
    public Result<User> login(String username, String password, HttpSession session) {
       Result<User> result =userService.login(username, password);
        return null;

    }


}
