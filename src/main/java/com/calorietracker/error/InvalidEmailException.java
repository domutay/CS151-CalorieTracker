package com.calorietracker.error;

public class InvalidEmailException extends RegistrationException {
    public InvalidEmailException() {
        super();
    }
    public InvalidEmailException(String message) {
        super(message);
    }
}
