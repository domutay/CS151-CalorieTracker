package com.calorietracker.dto;

public class CalorieDto {
    private String username;
    private int calories;
    private String foodName;
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

    public void setFoodName(String food) { this.foodName = food;}

    public String getFoodName() {return foodName;}

}
