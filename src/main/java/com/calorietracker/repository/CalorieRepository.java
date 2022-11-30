package com.calorietracker.repository;

import com.calorietracker.model.Calorie;
import com.calorietracker.model.User;
import com.calorietracker.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalorieRepository extends MongoRepository<Calorie, String> {
    void deleteAll();
}
