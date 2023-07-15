package com.tunteet.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homeApp() {
        return "app/home";
    }

    @GetMapping({"/login"})
    public String index() {
        return "user/login";
    }

}
