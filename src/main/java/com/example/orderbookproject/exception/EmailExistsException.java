package com.example.orderbookproject.exception;

/**
 * The type Email exists exception.
 */
public class EmailExistsException extends RuntimeException {

    /**
     * Instantiates a new Email exists exception.
     */
    public EmailExistsException() {
    }

    /**
     * Instantiates a new Email exists exception.
     *
     * @param message the message
     */
    public EmailExistsException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Email exists exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public EmailExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Email exists exception.
     *
     * @param cause the cause
     */
    public EmailExistsException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Email exists exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public EmailExistsException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
