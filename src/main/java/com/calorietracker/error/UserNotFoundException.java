package com.calorietracker.error;

public class UserNotFoundException extends LoginException {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}