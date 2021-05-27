package com.pkj.boker.demo.six.error;

public class NotFoundException extends SampleException {
  public NotFoundException(String errReason) {
    super(404, errReason);
  }
}
