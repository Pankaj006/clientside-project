package com.example.registrationlogindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    
      @GetMapping("/")
    public String homepage() {
        return "index";
    }

    @GetMapping("index.html")
    public String home() {
        return "index";
    }

    @GetMapping("about.html")
    public String about() {
        System.out.println("calling");
        return "about";
    }
    @GetMapping("accom.html")
    public String classes() {
        return "accom";
    }
    @GetMapping("res.html")
    public String res() {
        return "res";
    }
    @GetMapping("attraction.html")
    public String prices() {
        return "attraction";
    }

    @GetMapping("contact.html")
    public String contact() {
        return "contact";
    }
}
