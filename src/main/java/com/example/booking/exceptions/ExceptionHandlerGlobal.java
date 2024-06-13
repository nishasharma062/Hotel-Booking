package com.example.booking.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandlerGlobal  {

  @ExceptionHandler({ BookingExceptions.class })
  public ResponseEntity<Object> handleBookingException(Exception ex) {
      return new ResponseEntity<Object>(  ex.getMessage(), HttpStatus.FORBIDDEN);
  }
  
  @ExceptionHandler({ HotelExceptions.class })
  public ResponseEntity<Object> handleHotelException(Exception ex) {
      return new ResponseEntity<Object>(  ex.getMessage(), HttpStatus.FORBIDDEN);
  }
  
  @ExceptionHandler({ UserExceptions.class })
  public ResponseEntity<Object> handleUserException(Exception ex) {
      return new ResponseEntity<Object>(  ex.getMessage(), HttpStatus.FORBIDDEN);
  }
  
 
}
