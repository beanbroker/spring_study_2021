package com.pkj.boker.demo.six.error;


import lombok.Getter;

@Getter
public class ClientErrorResponse {

    private String reason;

    public ClientErrorResponse(String reason) {
        this.reason = reason;
    }
}
