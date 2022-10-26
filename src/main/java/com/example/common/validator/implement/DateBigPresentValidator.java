package com.example.common.validator.implement;

import com.example.common.validator.anotation.DateBigPresent;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

public class DateBigPresentValidator implements ConstraintValidator<DateBigPresent, Date> {
    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        Date date = new Date();
        return value.after(date) || value == null;
    }
}
