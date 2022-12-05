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

    public int getFoodCalories() {
        String inp = this.getFoodName().toLowerCase();
        if(inp.equals("tomato")) {
            return 22;
        } else if(inp.equals("steak")) {
            return 679;
        } else if(inp.equals("chicken")) {
            return 335;
        } else if(inp.equals("cheese")) {
            return 113;
        } else if(inp.equals("asparagus")) {
            return 20;
        } else if(inp.equals("milk")) {
            return 103;
        } else if(inp.equals("salad")) {
            return 100;
        } else {
            System.out.println("Food not in database.");
            return 0;
        }
    }
}
