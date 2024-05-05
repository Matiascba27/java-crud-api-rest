package com.apirest.apirest.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Indica que esta clase es un controlador de excepciones
@ControllerAdvice 
public class GlobalExceptionHandler {

    // Indica que el metodo siguiente es una excepcion global 
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception ex) {
        return new ResponseEntity<>("Ocurrio un error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    // Indica que el metodo siguiente es una excepcion personalizada NullPointerException
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio una excepcion: " + ex.getMessage());
    }

    // Indica que el metodo siguiente es una excepcion personalizada IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocurrio una excepcion de argumento ilegal: " + ex.getMessage());
    }

    // Indica que el metodo siguiente es una excepcion personalizada UnsupportedOperationException
    @ExceptionHandler(UnsupportedOperationException.class)
    public ResponseEntity<String> handleUnsupportedOperationException(UnsupportedOperationException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ocurrio una excepcion de operacion no compatible: " + ex.getMessage());
    }
}
