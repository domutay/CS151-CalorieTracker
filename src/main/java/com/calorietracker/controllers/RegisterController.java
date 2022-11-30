package com.calorietracker.controllers;

import com.calorietracker.dto.UserDto;
import com.calorietracker.model.User;
import com.calorietracker.service.IUserService;
import com.calorietracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableMongoRepositories
public class RegisterController {
    @Autowired
    private UserService userService = new UserService();
    @GetMapping("/register")
    public String register(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "register";
    }
    @PostMapping("/home")
    public String registerSubmit(@ModelAttribute UserDto userDto, Model model) {
        model.addAttribute("user", userDto);
        userService.registerNewUserAccount(userDto);
        if (!userService.isVerified()) {
            model.addAttribute("error", userService.getError());
            System.out.println(userService.getError());
            return "register";
        }

        return "home";
    }
}
