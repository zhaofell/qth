package com.example.qth.controller;

import com.example.qth.domain.User;
import com.example.qth.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class LogsController {
    @Autowired
    private LogService logService;
    @RequestMapping("/logs")
    private String ShowLogs(Model model, @SessionAttribute User user){
        model.addAttribute("logs", logService.showLogsByUser(user.getEmail()));
        return "logs";

    }
}
