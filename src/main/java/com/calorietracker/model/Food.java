package com.calorietracker.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Food")
public class Food {
    private String description;
    private int calories;
    public Food(String description, int calories) {
        super();
        this.calories = calories;
        this.description = description;
    }
    public Food() {

    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
