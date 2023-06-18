//package com.example.wedphim.Validator;
//
//import com.example.wedphim.Validator.annotation.ValidCategoryId;
//import com.example.wedphim.entity.loaiPhim;
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//
//public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, loaiPhim> {
//    @Override
//    public boolean isValid(loaiPhim category, ConstraintValidatorContext constraintValidatorContext ) {
//        return category !=null && category.getId() !=null;
//    }
//
//}
