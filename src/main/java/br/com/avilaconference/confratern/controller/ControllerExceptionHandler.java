package br.com.avilaconference.confratern.controller;

import br.com.avilaconference.confratern.dto.ErrorDTO;
import br.com.avilaconference.confratern.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(exception = NotFoundException.class)
    public ResponseEntity<ErrorDTO> handleNotFoundException(NotFoundException ex) {
        return ResponseEntity.status(404).body(new ErrorDTO(ex.getMessage()));
    };
}
