package com.drawandupdate.omega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GameController {
    @RequestMapping("/")
    public String list(Map<String, Object> model) {
        return "games";
    }

    public void create(@RequestParam String name, @RequestParam String password) {

    }

    public void join(@RequestParam long id) {

    }
}
