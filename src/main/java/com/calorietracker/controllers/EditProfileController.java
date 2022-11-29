package com.calorietracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditProfileController {
    @RequestMapping("/editprofile")
    public String editprofile(Model model) {
        return "editprofile";
    }
}
