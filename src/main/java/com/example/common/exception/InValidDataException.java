package com.example.common.exception;

public class InValidDataException extends RuntimeException{
    private static final long serialVersionUID = 6620520008237236930L;

    public InValidDataException(String message) {
        super(message);
    }
}
