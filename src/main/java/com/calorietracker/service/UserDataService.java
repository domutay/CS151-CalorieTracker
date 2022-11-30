package com.calorietracker.service;

import com.calorietracker.dto.CalorieDto;
import com.calorietracker.model.Calorie;
import com.calorietracker.repository.CalorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@EnableMongoRepositories
public class UserDataService {

    @Autowired
    private CalorieRepository calorieRepository;

    @Scheduled(cron = "* * * 1 * *")
    public void resetUserCalories() {
        calorieRepository.deleteAll();
    }

    public void registerUserCalories(CalorieDto calorieDto) {
        Calorie calorie = new Calorie();
        calorie.setUsername(calorieDto.getUsername());
        calorie.setCalories(calorieDto.getCalories());
        calorieRepository.save(calorie);
    }
}
