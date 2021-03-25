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
        return "index";
    }
//
//    @GetMapping("/secured")
//    public String secured() {
//        return "index";
//    }
//

    @GetMapping("/hello")
    public Cat doSomething() {
        return new Cat(1L, "Zianon", "WRW");
    }


    @GetMapping("/zhyvie")
    @ResponseBody
    public Cat zhyvieSomething() {
         return new Cat(1L, null, null);
    }



    @GetMapping("/addcat")
    public String showAddCatForm(Model model) {
        Cat cat = new Cat(1L, null, null);
        model.addAttribute("cat", cat);
        return "cat-form";
    }

    @PostMapping("/addcat")
    public String showAddCatForm(@ModelAttribute(value = "cat") Cat cat) {
        System.out.println(cat.getId() + " " + cat.getName() + " " + cat.getColor());
        return "redirect:/zhyvie";
    }
}
