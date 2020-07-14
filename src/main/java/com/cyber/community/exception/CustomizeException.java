package com.cyber.community.exception;

public class CustomizeException extends RuntimeException{
    private String message;

    public CustomizeException(CustomizeErrorCode message) {
        this.message = message.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
