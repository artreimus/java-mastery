package com.example._01_functional_interfaces;

public class LambdasDemo {
    public static void show() {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }


}
