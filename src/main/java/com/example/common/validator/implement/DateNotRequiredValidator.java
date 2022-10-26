package com.example.common.validator.implement;

import com.example.common.validator.anotation.DateNotRequired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNotRequiredValidator implements ConstraintValidator<DateNotRequired, String> {

    private String format;

    @Override
    public void initialize(DateNotRequired format) {
        this.format = format.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(s)) {
            return true;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            Date finalDate = simpleDateFormat.parse(s);
            String finalString = simpleDateFormat.format(finalDate);
            return finalString.equals(s);
        } catch (ParseException e) {
            return false;
        }
    }
}
