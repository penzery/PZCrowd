package com.pz.crowd.exception;

public class DeleteCurrentAdminException extends RuntimeException{
    public DeleteCurrentAdminException() {
    }

    public DeleteCurrentAdminException(String message) {
        super(message);
    }

    public DeleteCurrentAdminException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteCurrentAdminException(Throwable cause) {
        super(cause);
    }

    public DeleteCurrentAdminException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
