package com.example.orderbookproject.exception;

/**
 * The type No permission exception.
 */
public class NoPermissionException extends RuntimeException {

    /**
     * Instantiates a new No permission exception.
     */
    public NoPermissionException() {
    }

    /**
     * Instantiates a new No permission exception.
     *
     * @param message the message
     */
    public NoPermissionException(String message) {
        super(message);
    }

    /**
     * Instantiates a new No permission exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public NoPermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new No permission exception.
     *
     * @param cause the cause
     */
    public NoPermissionException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new No permission exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public NoPermissionException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
