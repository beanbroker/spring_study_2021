package com.pkj.boker.demo.six.error;

public class UniqueException extends SampleException{
    public UniqueException(String errReason) {
        super(409, errReason);
    }
}
