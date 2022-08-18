package com.example.thorwing_exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
