package com.looseChen.service;


import com.baomidou.mybatisplus.service.IService;
import com.looseChen.entity.blog.po.User;

import java.util.List;

/**
 * @author looseChen
 * @since 2018-10-03
 */
public interface UserService extends IService<User> {

    public List<User> getUsers();
}
