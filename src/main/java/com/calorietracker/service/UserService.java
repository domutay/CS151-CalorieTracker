package com.calorietracker.service;

import com.calorietracker.dto.UserDto;
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

    public User registerNewUserAccount(UserDto userDto) {
//        WIP
//        if (emailExists(userDto.getEmail())) {
//            throw new UserAlreadyExistsException("There is an account with that email address: " + userDto.getEmail());
//        }
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAge(userDto.getAge());
        user.setRecommend(userDto.isRecommend());
        return repository.save(user);
    }

    private boolean emailExists(String email) {
        return repository.findByEmail(email) != null;
    }

    public void changeUserPassword(User user, String password) {
        user.setPassword(password);
        repository.save(user);
    }

    public User findUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    public void saveRegisteredUser(User user) {
        repository.save(user);
    }

}
