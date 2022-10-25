package com.example.common.exception;

public class PasswordNotMatchException extends RuntimeException {

    private static final long serialVersionUID = 6620520008237236930L;

    /**
     * Instantiates a new User Not Found exception.
     *
     * @param message the message
     */
    public PasswordNotMatchException(String message) {
        super(message);
    }
}
