//
//package com.example.wedphim.Validator.annotation;
//
//import com.example.kiethuynh.repository.IUserRepository;
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class ValidUsernameValidator implements ConstraintValidator<ValidUserId, String> {
//    @Autowired
//    private IUserRepository userRepository;
//
//    @Override
//    public boolean isValid(String username, ConstraintValidatorContext context){
//        if(userRepository == null)
//            return true;
//        return userRepository.findByUsername(username) == null;
//    }
//}
//
