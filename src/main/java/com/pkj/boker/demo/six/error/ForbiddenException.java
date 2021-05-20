package com.pkj.boker.demo.six.error;

public class ForbiddenException extends SampleException {
  public ForbiddenException(String errReason) {
    super(403, errReason);
  }
}
