package com.pkj.boker.demo.six.error;

public class ConflictException extends SampleException {
  public ConflictException(String errReason) {
    super(409, errReason);
  }
}
