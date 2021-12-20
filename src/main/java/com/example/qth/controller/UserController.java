package com.example.qth.controller;

import com.example.qth.domain.User;

import com.example.qth.service.LoginService;
import com.example.qth.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"user"})
public class UserController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private SignInService signInService;

    @RequestMapping("/toLogin")//
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toSignIn")
    public String toSignIn() {
        return "signIn";
    }

    @RequestMapping("/signIn")
    public String signIn(String email, String password){
        if(signInService.signIn(email, password) == null)
            return "signIn";
        else
            return "login";
    }



    @RequestMapping("/login")
    public String login(Model model, String email, String password){
        User user = loginService.login(email,password);
        if(user==null)
            return "login";
        else {
            model.addAttribute("user", user);
            return"redirect:/logs";
        }
    }

}
