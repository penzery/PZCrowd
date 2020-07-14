package com.pz.crowd.exception;

public class UpdateAdminFailedException extends RuntimeException{
    public UpdateAdminFailedException() {
    }

    public UpdateAdminFailedException(String message) {
        super(message);
    }

    public UpdateAdminFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateAdminFailedException(Throwable cause) {
        super(cause);
    }

    public UpdateAdminFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
