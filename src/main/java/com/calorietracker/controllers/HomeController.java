package com.calorietracker.controllers;

import com.calorietracker.dto.UserDto;
import com.calorietracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService = new UserService();

    @GetMapping("/")
    public String home(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        if (!userService.isVerified()) {
            model.addAttribute("error", userService.getError());
            System.out.println(userService.getError());
            return "index";
        }
        return "index";
    }

    @PostMapping("/")
    public String loginSubmit(@ModelAttribute UserDto userDto, Model model) {
        model.addAttribute("user", userDto);
        if (userService.verifyLoginInfo(userDto)) {
            return "dashboard";
        }
        model.addAttribute("error", userService.getError());
        return "index";
    }

}
