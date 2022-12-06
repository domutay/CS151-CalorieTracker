package com.calorietracker.dto;

import java.util.List;

public class UserProfileDto {
    private List<String> allergies;
    private List<String> likes;
    private List<String> dislikes;
    private boolean weightLoss;
    private boolean weightGain;
    private boolean weightNeither;
    private int currentWeight;
    private int goalWeight;
    private int dailyCalorieIntake;
    private int goalCalorieIntake;

    public void addAllergy(String allergy) {
        this.allergies.add(allergy);
    }
    public void addLikes(String like) {
        this.likes.add(like);
    }
    public void addDislikes(String dislike) {
        this.dislikes.add(dislike);
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getDailyCalorieIntake() {
        return dailyCalorieIntake;
    }

    public int getGoalCalorieIntake() {
        return goalCalorieIntake;
    }

    public int getGoalWeight() {
        return goalWeight;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<String> getDislikes() {
        return dislikes;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setDailyCalorieIntake(int dailyCalorieIntake) {
        this.dailyCalorieIntake = dailyCalorieIntake;
    }

    public void setDislikes(List<String> dislikes) {
        this.dislikes = dislikes;
    }

    public void setGoalCalorieIntake(int goalCalorieIntake) {
        this.goalCalorieIntake = goalCalorieIntake;
    }

    public void setGoalWeight(int goalWeight) {
        this.goalWeight = goalWeight;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public void setWeightLoss(boolean weightLoss) {
        this.weightLoss = weightLoss;
    }
}
