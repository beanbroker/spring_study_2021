package com.pkj.boker.demo.six.error;

import lombok.Getter;

@Getter
public class SampleException extends RuntimeException {

  public SampleException(Integer httpStatusCode, String errReason) {
    this.httpStatusCode = httpStatusCode;
    this.errReason = errReason;
  }

  private Integer httpStatusCode;
  private String errReason;
}
