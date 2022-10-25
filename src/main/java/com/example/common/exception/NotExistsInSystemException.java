package com.example.common.exception;

public class NotExistsInSystemException extends RuntimeException {

    private static final long serialVersionUID = 6620520008237236930L;

    public NotExistsInSystemException(String message) {
        super(message);
    }
}
