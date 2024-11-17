package com.loginsystem.service.impl;

import com.loginsystem.mapper.UserMapper;
import com.loginsystem.pojo.User;
import com.loginsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean verifyUser(String username, String password){
        User user=userMapper.findUserByPassword(username,password);
        return user!=null;
    }

}
