package com.exception.demo.utils;

import com.exception.demo.exceptions.DocumentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = DocumentNotFoundException.class)
    ResponseEntity<Object> documentNotFoundException(DocumentNotFoundException exception) {
        return new ResponseEntity<>("Requested product not found", HttpStatus.BAD_REQUEST);
    }


}
