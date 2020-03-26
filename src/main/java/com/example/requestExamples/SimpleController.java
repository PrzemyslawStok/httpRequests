package com.example.requestExamples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody String getInfo(){
        return "Info...";
    }
}
