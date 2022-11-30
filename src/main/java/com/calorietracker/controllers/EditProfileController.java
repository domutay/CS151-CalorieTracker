package com.calorietracker.controllers;

import com.calorietracker.dto.UserProfileDto;
import com.calorietracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditProfileController {
    @Autowired
    private UserService userService;
    @GetMapping("/editprofile")
    public String editprofile(Model model) {
        UserProfileDto userProfileDto = new UserProfileDto();
        model.addAttribute("userProfile", userProfileDto);

        return "editprofile";
    }
}
