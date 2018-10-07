package com.looseChen.blog.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.looseChen.entity.blog.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author looseChen
 * @since 2018-10-03
 */
@Mapper
@Component
public interface UserDao extends BaseMapper<User> {

}
