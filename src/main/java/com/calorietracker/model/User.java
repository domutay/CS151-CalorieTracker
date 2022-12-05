package com.calorietracker.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("User")
public class User {
    private String username;
    private String email;
    private String password;
    private int age;
    private boolean recommend;
    private UserProfile userProfile;

    private Calorie calorie;
    private ArrayList<String> recipes = new ArrayList<>();

    public User(String username, String email, String password, int age, boolean recommend) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.recommend = recommend;
    }

    public User() {

    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
    public boolean isRecommend() {
        return recommend;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void addRecipe(String recipe) {
        this.recipes.add(recipe);
        return;
    }
}
