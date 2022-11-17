package com.ey.insurance_service.handler;

import com.ey.insurance_service.Exception.ErrorDetails;
import com.ey.insurance_service.Exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<ErrorDetails> NotFoundException(Exception ex, WebRequest request){
        ErrorDetails er=new ErrorDetails(ex.getMessage(),new Date(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<ErrorDetails>(er,HttpStatus.NOT_FOUND);
    }
}
