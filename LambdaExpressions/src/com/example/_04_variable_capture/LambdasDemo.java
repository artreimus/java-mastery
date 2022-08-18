package com.example._04_variable_capture;

public class LambdasDemo {
    public static String prefix = "-";

    public static void show() {
        greet(message -> System.out.println(prefix + message)); // it automatically knows the of the parameter
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }


}
