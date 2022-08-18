package com.example.chaining_exceptions;


// Checked -> Extends Exception
// Unchecked (runtime) -> Extends RuntimeException

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }

}
