package com.example.qth;

import com.example.qth.domain.Log;
import com.example.qth.domain.User;
import com.example.qth.mapper.LogMapper;
import com.example.qth.mapper.UserMapper;
import com.example.qth.service.LogService;
import com.example.qth.service.SignInService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class QthApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LogMapper logMapper;
    @Autowired
    private LogService logService;
    @Autowired
    private SignInService signInService;

    @Test
    void contextLoads() {
        userMapper.findByEmailAndPassword("tom@.qq","123456");

    }
    @Test
    void contextLoads2() {
        User user = new User();
        user.setEmail("t");
        user.setPassword("12390");
        userMapper.save(user);
    }


    @Test
    void contextLoads1(){
        logMapper.findByUserEmail("tom@.qq");
    }
    @Test
    void contextLoads6(){
        logService.showLogsByUser("zzz");
    }
    @Test
    void contextLoads7(){
        Log log = new Log();
        log.setLoginTime(LocalDateTime.now());
        log.setId(1);
        logService.saveLog(log);
    }
    @Test
    void contextLoads11(){
        signInService.signIn("1234567890","1");

    }
}
