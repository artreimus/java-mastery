package com.example._03_lambda_expression;

public class LambdasDemo {
    public static void show() {

        greet(message -> System.out.println(message)); // it automatically knows the of the parameter
        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }


}
