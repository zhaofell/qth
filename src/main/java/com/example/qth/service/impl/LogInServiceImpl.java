package com.example.qth.service.impl;

import com.example.qth.domain.Log;
import com.example.qth.domain.User;
import com.example.qth.mapper.UserMapper;
import com.example.qth.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class LogInServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String email, String password) {
        User user =userMapper.findByEmailAndPassword(email,password);
        if(user==null)
        return null;
        else {
            LocalDateTime now= LocalDateTime.now();
            Log log = new Log();
            log.setLoginTime(now);
            log.setUser(user);
            userMapper.update(email,now);
            return user;


        }
    }
}
