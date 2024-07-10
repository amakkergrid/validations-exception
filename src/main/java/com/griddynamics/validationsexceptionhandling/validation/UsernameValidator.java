package com.griddynamics.validationsexceptionhandling.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {

    @Override
    public void initialize(ValidUsername constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        // Custom validation logic (e.g., no special characters)
        return username != null && username.matches("^[a-zA-Z0-9]*$");
    }
}

