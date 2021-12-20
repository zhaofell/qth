package com.example.qth.service;

import com.example.qth.domain.Log;

import java.util.List;

public interface LogService {
    List<Log> showLogsByUser( String email);
    boolean saveLog(Log log);
}
