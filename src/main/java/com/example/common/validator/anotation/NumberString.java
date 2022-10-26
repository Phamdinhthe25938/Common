package com.example.common.validator.anotation;

import com.example.common.validator.implement.NumberStringValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = {NumberStringValidator.class})
public @interface NumberString {

    String message() default "{Number.is.required}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
