package com.example.common.validator.implement;


import com.example.common.validator.anotation.NotCharacterEspecially;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotCharacterEspeciallyValidator  implements ConstraintValidator<NotCharacterEspecially, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value.matches("[A-Za-z0-9]+");
    }
}
