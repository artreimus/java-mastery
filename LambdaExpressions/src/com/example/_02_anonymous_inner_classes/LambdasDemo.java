package com.example._02_anonymous_inner_classes;

public class LambdasDemo {
    public static void show() {
        greet(new Printer() { // anonymous inner class
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }


}
