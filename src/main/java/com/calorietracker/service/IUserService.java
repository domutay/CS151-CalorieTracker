package com.calorietracker.service;

import com.calorietracker.dto.UserDto;
import com.calorietracker.model.User;

public interface IUserService {
    void registerNewUserAccount(UserDto accountDto);
    boolean verifyLoginInfo(UserDto userDto);
    User findUserByEmail(String email);
    void changeUserPassword(User user, String password);
    void saveRegisteredUser(User user);
}
