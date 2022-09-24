package com.manalrzzl.professionalproject.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//statusCode: 400
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{

  public BadRequestException(String message) {
    super(message);
  }
}
