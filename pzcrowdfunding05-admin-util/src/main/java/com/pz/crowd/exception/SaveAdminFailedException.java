package com.pz.crowd.exception;

public class SaveAdminFailedException extends RuntimeException{
    public SaveAdminFailedException() {
    }

    public SaveAdminFailedException(String message) {
        super(message);
    }

    public SaveAdminFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public SaveAdminFailedException(Throwable cause) {
        super(cause);
    }

    public SaveAdminFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
