package com.fooddeliveryapp.foodappbackend.exception;

public class MenuItemNotFoundException extends Exception {
    public MenuItemNotFoundException() {
        super();
    }

    public MenuItemNotFoundException(String message) {
        super(message);
    }

    public MenuItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuItemNotFoundException(Throwable cause) {
        super(cause);
    }

    protected MenuItemNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
