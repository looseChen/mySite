package com.looseChen.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.looseChen.blog.dao.UserDao;
import com.looseChen.entity.blog.po.User;
import com.looseChen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author looseChen
 * @since 2018-10-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.selectList(null);
    }
}
