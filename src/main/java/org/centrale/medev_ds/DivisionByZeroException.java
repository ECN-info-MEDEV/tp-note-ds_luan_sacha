package org.centrale.medev_ds;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException() {
        super("Division by zero not allowed"); //en effet
    }

    public DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroException(Throwable cause) {
        super(cause);
    }
}
