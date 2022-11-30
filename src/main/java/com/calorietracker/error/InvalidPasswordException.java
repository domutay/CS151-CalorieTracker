package com.calorietracker.error;

public class InvalidPasswordException extends RegistrationException {
    public InvalidPasswordException() {
        super();
    }
    public InvalidPasswordException(String message) {
        super(message);
    }
}
