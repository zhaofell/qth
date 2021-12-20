package com.example.qth.controller;

import com.example.qth.domain.Log;
import com.example.qth.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RestTestController {
    @Autowired
    private LogMapper logMapper;

    @CrossOrigin
    @ResponseBody//将java中对象转换成JSON
    @RequestMapping("/send")
    public List<Log> send(){ //JSON:是一种交换格式  表现形式是一个字符串
        return logMapper.findByUserEmail("tom@qq.com");
    }
    @RequestMapping("/receive")
    @ResponseBody // 将JAVA只能中的对象换成JSON
    @CrossOrigin  //解决跨域问题
    public String receive(@RequestBody Log log){
        System.out.println("从前台来的是：" +log);
        return"OK";
    }
}
