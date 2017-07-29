package com.drawandupdate.omega;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TestController {

    @RequestMapping
    @ResponseBody
    public TestPojo index() {
        return new TestPojo("hello", "world");
    }

    @RequestMapping("/foo")
    public String templatetest(Map<String, Object> model) {
        model.put("world", "Schinken");
        return "test";
    }
}
