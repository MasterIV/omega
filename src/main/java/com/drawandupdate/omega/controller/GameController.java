package com.drawandupdate.omega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GameController {
    @RequestMapping("/")
    public String list(Map<String, Object> model) {
        return "games";
    }
}
