package com.example.orderbookproject.exception;

/**
 * The type Username exists exception.
 */
public class UsernameExistsException extends RuntimeException {

    /**
     * Instantiates a new Username exists exception.
     */
    public UsernameExistsException() {
    }

    /**
     * Instantiates a new Username exists exception.
     *
     * @param message the message
     */
    public UsernameExistsException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Username exists exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public UsernameExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Username exists exception.
     *
     * @param cause the cause
     */
    public UsernameExistsException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Username exists exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public UsernameExistsException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
