package com.calorietracker.controllers;

import com.calorietracker.dto.UserDto;
import com.calorietracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute UserDto userDto, Model model) {
        model.addAttribute("user", userDto);
        if (userService.verifyLoginInfo(userDto)) {
            return "dashboard";
        }
        return "login";
    }
}
