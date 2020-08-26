package com.github.mathan.systemdesign.vendingmachine;

public class NotSufficientChangeException extends RuntimeException {
    public NotSufficientChangeException() {
    }

    public NotSufficientChangeException(String message) {
        super(message);
    }

    public NotSufficientChangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSufficientChangeException(Throwable cause) {
        super(cause);
    }

    public NotSufficientChangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
