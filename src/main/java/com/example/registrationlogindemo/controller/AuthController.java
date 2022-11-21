package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {


    @GetMapping("index.html")
    public String home() {
        return "index";
    }

    @GetMapping("about.html")
    public String about() {
        return "about";
    }
    @GetMapping("classes.html")
    public String classes() {
        return "classes";
    }
    @GetMapping("yoga.html")
    public String yoga() {
        return "yoga";
    }
    @GetMapping("pricing.html")
    public String prices() {
        return "pricing";
    }

    @GetMapping("contact.html")
    public String contact() {
        return "contact";
    }
}
