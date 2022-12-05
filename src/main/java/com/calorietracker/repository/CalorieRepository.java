package com.calorietracker.repository;

import com.calorietracker.model.Calorie;
import com.calorietracker.model.User;
import com.calorietracker.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CalorieRepository extends MongoRepository<Calorie, String> {
    void deleteAll();
    Calorie findByUsername(String username);
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'password' : 1}")
    List<User> findAll(String category);

    public long count();
}
