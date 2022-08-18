package com.example.rethrowing_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) { // Throwable is the parent of all errors
            System.out.println("An unexpected error occured");
        }
    }
}