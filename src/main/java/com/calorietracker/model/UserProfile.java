package com.calorietracker.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;

@Document("UserProfile")
public class UserProfile {
    private HashMap<String, Integer> foodsTracked;
    private List<String> allergies;
    private List<String> likes;
    private List<String> dislikes;
    private boolean weightLoss; // TRUE: Lose weight, FALSE: Gain weight
    private int currentWeight;
    private int goalWeight;
    private int dailyCalorieIntake;
    private int goalCalorieIntake;
    private int caloriesToday;

    public UserProfile(List<String> allergies, List<String> likes, List<String> dislikes, boolean weightLoss, int currentWeight, int goalWeight, int dailyCalorieIntake, int goalCalorieIntake) {
        super();
        this.allergies = allergies;
        this.likes = likes;
        this.dislikes = dislikes;
        this.weightLoss = weightLoss;
        this.currentWeight = currentWeight;
        this.goalWeight = goalWeight;
        this.dailyCalorieIntake = dailyCalorieIntake;
        this.goalCalorieIntake = goalCalorieIntake;
        caloriesToday = 0;
    }
    public UserProfile() {

    }

    public int getCaloriesToday() {
        return caloriesToday;
    }
}
