package com.drawandupdate.omega;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping
    @ResponseBody
    public TestPojo index() {
        return new TestPojo("hello", "world");
    }
}
