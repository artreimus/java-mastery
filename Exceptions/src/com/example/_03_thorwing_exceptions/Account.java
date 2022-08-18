package com.example.thorwing_exceptions;

import java.io.IOException;

public class Account {
    public void deposit(float value) throws IOException {  // tells that this method throws an IOException
        if (value <= 0) {
            throw new IOException();
        }
    }
}
