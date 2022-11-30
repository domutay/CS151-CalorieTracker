package com.calorietracker.error;

public class UserAlreadyExistsException extends RegistrationException {
    public UserAlreadyExistsException() {
        super();
    }
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
