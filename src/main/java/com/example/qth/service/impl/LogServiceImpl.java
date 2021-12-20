package com.example.qth.service.impl;

import com.example.qth.domain.Log;
import com.example.qth.mapper.LogMapper;
import com.example.qth.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service//事物层
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public List<Log> showLogsByUser(String email) {
        return logMapper.findByUserEmail(email);
    }
    @Transactional//事物处理，增删该记得加这个注释
    @Override
    public boolean saveLog(Log log) {
        return logMapper.save(log) == 1;
    }
}
