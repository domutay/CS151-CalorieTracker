package com.calorietracker.service;

import com.calorietracker.dto.CalorieDto;
import com.calorietracker.model.Calorie;
import com.calorietracker.repository.CalorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
@EnableMongoRepositories
public class UserDataService {

    @Autowired
    private CalorieRepository calorieRepository;

    @PostConstruct
    @Scheduled(cron = "@daily")
    public void resetUserCalories() {
        calorieRepository.deleteAll();
    }

    public void registerUserCalories(CalorieDto calorieDto) {

            Calorie calorie = findCalorieByUsername(calorieDto.getUsername());
            calorie.setCalories(calorieDto.getCalories() + calorie.getCalories());
            calorieRepository.save(calorie);


    }
    public Calorie findCalorieByUsername(String username) {
        if (userHasCalorie(username)) {
            return calorieRepository.findByUsername(username);
        }
        Calorie calorie = new Calorie();
        calorie.setCalories(0);
        calorie.setUsername(username);
        return calorie;
    }
    public boolean userHasCalorie(String username) {
        return calorieRepository.findByUsername(username) != null;
    }
}
