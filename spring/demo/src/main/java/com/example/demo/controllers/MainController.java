package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/main")
public class MainController {
    @GetMapping
    public String index() {
        return "hello";
    }
//
//    @GetMapping("/secured")
//    public String secured() {
//        return "index";
//    }
//

    @GetMapping("/hello")
    public String doSomething() {
        return "hello";
    }



}
