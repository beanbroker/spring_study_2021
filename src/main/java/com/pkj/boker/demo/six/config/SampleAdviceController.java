package com.pkj.boker.demo.six.config;

import com.pkj.boker.demo.six.error.ClientErrorResponse;
import com.pkj.boker.demo.six.error.SampleException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class SampleAdviceController {

  @ExceptionHandler(SampleException.class)
  public ResponseEntity<ClientErrorResponse> handleSampleException(SampleException e) {

    ClientErrorResponse clientErrorResponse = new ClientErrorResponse(e.getErrReason());
    return new ResponseEntity<>(clientErrorResponse, HttpStatus.valueOf(e.getHttpStatusCode()));
  }
}
