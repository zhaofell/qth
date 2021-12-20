package com.example.qth.service.impl;

import com.example.qth.domain.User;
import com.example.qth.mapper.UserMapper;
import com.example.qth.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInServiceImpl implements SignInService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User signIn(String email, String password) {
        String temp = userMapper.findEmail(email);
        if(temp!=null)
        return null;
        else{
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            userMapper.save(user);
            return user;

        }
    }

}
