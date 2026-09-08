package com.team.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class PersonController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/person")
    public String person(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "person";
    }
}
