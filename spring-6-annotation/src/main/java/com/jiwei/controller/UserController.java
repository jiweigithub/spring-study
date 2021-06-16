package com.jiwei.controller;

import com.jiwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Lazy
@Controller
public class UserController {

    public UserController() {
        System.out.println("执行了UserController无参构造");
    }

    @Autowired
    private UserService userService;

    public void test() {
        userService.test();
    }

}
