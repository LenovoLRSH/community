package com.cyber.community.exception;

import com.cyber.community.exception.ICustomizeErrorCode;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "你找的问题不在了，要不换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002,"问题没找到，没选择到"),
    NO_LOGIN(2003,"未登录"),
    SYSTEM_ERROR(2004,"服务冒烟了。等会再试试"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"评论不存在了。没找到");

    @Override
    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
