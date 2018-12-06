package com.eoc.service.impl;

import com.eoc.mapper.UserMapper;
import com.eoc.model.User;
import com.eoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yy on 2018/12/5.
 * Smile Waits For You
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
