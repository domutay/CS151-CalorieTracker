package com.calorietracker.model;

public class Food {
    private String description;
    private String[][] foodNutrients;

    public Food(String description, String[][] foodNutrients) {
        this.foodNutrients = foodNutrients;
        this.description = description;
    }
    public Food() {

    }
}
