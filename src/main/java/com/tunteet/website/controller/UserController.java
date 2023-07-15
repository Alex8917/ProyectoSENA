package com.tunteet.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tunteet.website.repository.UserRepository;
import com.tunteet.website.entity.User;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/menu")
    public String GetUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("usersList", users);
        return "user/users";
    }

}
