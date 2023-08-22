package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.model.LengthNotAppropriateException;

@ControllerAdvice
public class CustomerAdviseController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LengthNotAppropriateException.class)
    public ResponseEntity<Object> handleLengthNotAppropriateException(LengthNotAppropriateException ex) {
        
        String errorMessage = "Error: " + ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}

