package com.drawandupdate.omega.controller;

import com.drawandupdate.omega.entities.User;
import com.drawandupdate.omega.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    @Autowired
    private UserService service;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        User user = service.register(username, password);
        service.login(user, password);
        return "redirect:/";
    }
}
