package com.example.orderbookproject.exception;

/**
 * The type Username not found exception.
 */
public class UsernameNotFoundException extends RuntimeException {

    /**
     * Instantiates a new Username not found exception.
     */
    public UsernameNotFoundException() {
    }

    /**
     * Instantiates a new Username not found exception.
     *
     * @param message the message
     */
    public UsernameNotFoundException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Username not found exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public UsernameNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Username not found exception.
     *
     * @param cause the cause
     */
    public UsernameNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Username not found exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public UsernameNotFoundException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
