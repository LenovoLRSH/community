package com.cyber.community.exception;

import com.cyber.community.exception.ICustomizeErrorCode;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("你找的问题不在了，要不换个试试？");

    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
