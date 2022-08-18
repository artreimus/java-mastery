package com.example._02_anonymous_inner_classes;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }


}
