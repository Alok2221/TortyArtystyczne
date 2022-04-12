package pl.zaczarowaneslodkosci.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(value = EntityNotFoundException.class)
    public ResponseEntity<String> resourceNotFoundException(EntityNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), NOT_FOUND);
    }
}