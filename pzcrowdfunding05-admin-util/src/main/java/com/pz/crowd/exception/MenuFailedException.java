package com.pz.crowd.exception;

public class MenuFailedException extends RuntimeException{
    public MenuFailedException() {
    }

    public MenuFailedException(String message) {
        super(message);
    }

    public MenuFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuFailedException(Throwable cause) {
        super(cause);
    }

    public MenuFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
