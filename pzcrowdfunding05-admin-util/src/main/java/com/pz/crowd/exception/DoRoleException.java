package com.pz.crowd.exception;

public class DoRoleException extends RuntimeException{
    public DoRoleException() {
    }

    public DoRoleException(String message) {
        super(message);
    }

    public DoRoleException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoRoleException(Throwable cause) {
        super(cause);
    }

    public DoRoleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
