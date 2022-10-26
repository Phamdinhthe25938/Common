package com.example.common.validator.implement;

import com.example.common.validator.anotation.NumberString;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberStringValidator implements ConstraintValidator<NumberString, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value.matches("[0-9]+");
    }
}
