package com.calorietracker.service;

import com.calorietracker.dto.UserDto;
import com.calorietracker.model.User;

public interface IUserService {
    User registerNewUserAccount(UserDto accountDto);
    User findUserByEmail(String email);
    void changeUserPassword(User user, String password);
    void saveRegisteredUser(User user);
}
