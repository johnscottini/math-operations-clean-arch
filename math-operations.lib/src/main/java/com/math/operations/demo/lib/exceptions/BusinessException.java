package com.math.operations.demo.lib.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String message, Throwable cause,
                             boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public BusinessException(String message) {
        super(message);
    }
}