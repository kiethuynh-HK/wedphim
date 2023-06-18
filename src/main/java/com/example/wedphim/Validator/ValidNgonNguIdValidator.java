//package com.example.wedphim.Validator;
//
//
//import com.example.wedphim.Validator.annotation.ValidNgonNguId;
//
//import com.example.wedphim.entity.ngonNgu;
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//
//public class ValidNgonNguIdValidator implements ConstraintValidator<ValidNgonNguId, ngonNgu> {
//    @Override
//    public boolean isValid(ngonNgu ngonngu, ConstraintValidatorContext constraintValidatorContext ) {
//        return ngonngu !=null && ngonngu.getId() !=null;
//    }
//}
