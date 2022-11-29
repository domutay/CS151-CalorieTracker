package com.calorietracker.dto;

public class UserDto {
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean recommend;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    public boolean isRecommend() {
        return recommend;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
