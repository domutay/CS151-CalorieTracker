package com.calorietracker.error;

public class InvalidUsernameException extends RegistrationException {
    public InvalidUsernameException() {
        super();
    }
    public InvalidUsernameException(String message) {
        super(message);
    }
}
