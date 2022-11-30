package com.calorietracker.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("UserProfile")
public class UserProfile {
    private List<String> allergies;
    private List<String> likes;
    private List<String> dislikes;
    private boolean weightLoss;
}
