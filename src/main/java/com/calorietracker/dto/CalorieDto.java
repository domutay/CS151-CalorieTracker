package com.calorietracker.dto;

public class CalorieDto {
    private String username;
    private int calories;

    public String getUsername() {
        return username;
    }

    public int getCalories() {
        return calories;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
