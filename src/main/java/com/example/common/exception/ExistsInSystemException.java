package com.example.common.exception;


public class ExistsInSystemException extends RuntimeException {

    private static final long serialVersionUID = 6620520008237236930L;

    public ExistsInSystemException(String message) {
        super(message);
    }
}
