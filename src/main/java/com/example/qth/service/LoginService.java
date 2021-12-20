package com.example.qth.service;


import com.example.qth.domain.User;



public interface LoginService {
    User login(String email, String password);

}
