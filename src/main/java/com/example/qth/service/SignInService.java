package com.example.qth.service;

import com.example.qth.domain.User;



public interface SignInService {
    User signIn( String email, String password);
}
