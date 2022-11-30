package com.calorietracker.controllers;

import com.calorietracker.dto.CalorieDto;
import com.calorietracker.dto.UserDto;
import com.calorietracker.dto.UserProfileDto;
import com.calorietracker.service.UserDataService;
import com.calorietracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {
    @Autowired
    private UserService userService = new UserService();
    @Autowired
    private UserDataService userDataService = new UserDataService();

    @GetMapping("/")
    public String home(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        model.addAttribute("signedin", userService.isVerified());
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
    @GetMapping("/signup")
    public String register(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "signup";
    }
    @PostMapping("/signup")
    public String registerSubmit(@ModelAttribute UserDto userDto, Model model) {
        model.addAttribute("user", userDto);
        userService.registerNewUserAccount(userDto);
        if (!userService.isVerified()) {
            model.addAttribute("error", userService.getError());
            return "signup";
        }
        return "dashboard";
    }
    @GetMapping("/editprofile")
    public String editprofile(Model model) {
        UserProfileDto userProfileDto = new UserProfileDto();
        model.addAttribute("userProfile", userProfileDto);

        return "editprofile";
    }
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        CalorieDto calorieDto = new CalorieDto();
        model.addAttribute("calorie", calorieDto);
        if (!userService.isVerified()) {
            return "index";
        }
        return "dashboard";
    }

    @PostMapping("/dashboard")
    public String dashboardTrack(@ModelAttribute CalorieDto calorieDto, Model model) {
        model.addAttribute("calorie", calorieDto);
        calorieDto.setUsername(userService.getCurrentUser().getUsername());
        userDataService.registerUserCalories(calorieDto);
        return "dashboard";
    }

}
