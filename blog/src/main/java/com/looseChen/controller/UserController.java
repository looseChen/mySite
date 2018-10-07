package com.looseChen.controller;


import com.looseChen.entity.blog.po.User;
import com.looseChen.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author looseChen
 * @since 2018-10-03
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取全部用户")
    @GetMapping("/getList")
    public String getList() {
        List<User> users = userService.getUsers();
        return users.toString();
    }
}

