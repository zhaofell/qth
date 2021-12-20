package com.example.qth.domain;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class User {
    private String email;
    private String password;
    private Integer loginCount;
    private LocalDateTime lastLoginTime;
}
