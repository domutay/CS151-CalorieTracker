package com.calorietracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Calorie")
public class Calorie {
    @Id
    private String id;
    private String username;
    private int calories;
    public Calorie(String username, int calories) {
        super();
        this.username = username;
        this.calories = calories;
    }
    public Calorie() {

    }

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
