//package com.example.wedphim.Validator.annotation;
//
//import com.example.wedphim.Validator.ValidNgonNguIdValidator;
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import static java.lang.annotation.ElementType.FIELD;
//import static java.lang.annotation.ElementType.TYPE;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//@Target({TYPE,FIELD})
//@Retention(RUNTIME)
//@Constraint(validatedBy = ValidNgonNguIdValidator.class)
//@Documented
//public @interface ValidNgonNguId {
//    String message () default "Invalid Category ID";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default{};
//}
