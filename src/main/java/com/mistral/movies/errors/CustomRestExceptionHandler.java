package com.mistral.movies.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;


@ControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {CustomException.class})
    public ResponseEntity<Object> handleCustomException(CustomException e){

        ExceptionData exceptionData = new ExceptionData(e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                new Timestamp(System.currentTimeMillis()));
        return new ResponseEntity<>(e, exceptionData.getStatus());
    }
}
