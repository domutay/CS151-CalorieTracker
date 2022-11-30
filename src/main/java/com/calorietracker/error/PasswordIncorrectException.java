package com.calorietracker.error;

public class PasswordIncorrectException extends LoginException {
    public PasswordIncorrectException() {
        super();
    }
    public PasswordIncorrectException(String message) {
        super(message);
    }
}
