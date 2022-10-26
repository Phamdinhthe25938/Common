package com.example.common.validator.anotation;

import com.example.common.validator.implement.NotCharacterEspeciallyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = {NotCharacterEspeciallyValidator.class})
public @interface NotCharacterEspecially {
    String message() default "{String.not.character}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
