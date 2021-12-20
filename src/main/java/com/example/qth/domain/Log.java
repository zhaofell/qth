package com.example.qth.domain;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Log {
    private Integer id;
    private LocalDateTime loginTime;
    public User user;


}
