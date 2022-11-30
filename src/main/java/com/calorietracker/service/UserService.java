package com.calorietracker.service;

import com.calorietracker.dto.UserDto;
import com.calorietracker.dto.UserProfileDto;
import com.calorietracker.error.*;
import com.calorietracker.model.User;
import com.calorietracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@EnableMongoRepositories
public class UserService implements IUserService {
    @Autowired
    private UserRepository repository;
    private String error;
    private boolean verified;

    public void registerNewUserAccount(UserDto userDto) {
        try {
            if (emailExists(userDto.getEmail())) {
                throw new UserAlreadyExistsException("There already an account with the email address: " + userDto.getEmail());
            }
            if (usernameExists(userDto.getUsername())) {
                throw new UserAlreadyExistsException("There is already an account with the username: " + userDto.getUsername());
            }
            if (userDto.getPassword().length() < 8 || userDto.getPassword().length() > 16) {
                throw new InvalidPasswordException("Password must be between 8-16 characters in length.");
            }
            if (userDto.getUsername().length() < 3 || userDto.getUsername().length() > 10) {
                throw new InvalidUsernameException("Username must be between 3-10 characters in length");
            }
            if (userDto.getEmail().length() < 3) {
                throw new InvalidEmailException("Email is invalid.");
            }
            if (userDto.getPassword().contains(" ")) {
                throw new InvalidPasswordException("Password must not contain spaces.");
            }
            if (userDto.getUsername().contains(" ")) {
                throw new InvalidUsernameException("Username must not contain spaces.");
            }
            if (userDto.getEmail().contains(" ")) {
                throw new InvalidEmailException("Email must not contain spaces.");
            }
        }
        catch (RegistrationException re) {
            error = re.getMessage();
            verified = false;
            return;
        }
        verified = true;
        if (verified) {
            User user = new User();
            user.setUsername(userDto.getUsername());
            user.setEmail(userDto.getEmail());
            user.setPassword(userDto.getPassword());
            user.setAge(userDto.getAge());
            user.setRecommend(userDto.isRecommend());
            repository.save(user);
        }
    }
    public void registerUserProfile(UserProfileDto userProfileDto) {

    }
    public boolean verifyLoginInfo(UserDto userDto) {
        try {
            if (!emailExists(userDto.getEmail())) {
                throw new UserNotFoundException("Login information incorrect.");
            }
            if (!passwordCorrect(userDto.getEmail(), userDto.getPassword())) {
                throw new LoginException("Login information incorrect.");
            }
        }
        catch (LoginException le) {
            error = le.getMessage();
            return false;
        }
        return true;
    }
    private boolean passwordCorrect(String email, String password) {
        return repository.findByEmail(email).getPassword().equals(password);
    }

    private boolean usernameExists(String username) {
        return repository.findByUsername(username) != null;
    }
    private boolean emailExists(String email) {
        return repository.findByEmail(email) != null;
    }

    public void changeUserPassword(User user, String password) {
        user.setPassword(password);
        repository.save(user);
    }

    public boolean isVerified() {
        return verified;
    }

    public User findUserByEmail(String email) {
        return repository.findByEmail(email);
    }
    public User findUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    public void saveRegisteredUser(User user) {
        repository.save(user);
    }

    public String getError() {
        return error;
    }
}
