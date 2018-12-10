package com.zhoutao.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/mvc")
public class MvcHello {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("haha");
        return "hello";
    }
}
