package com.cyber.community.exception;

public class CustomizeException extends RuntimeException{
    private String message;
    private Integer code;

    public CustomizeException(CustomizeErrorCode message) {
        this.message = message.getMessage();
        this.code = message.getCode();
    }


    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
