package com.example._05_method_reference;

public class LambdasDemo {

    public LambdasDemo(String message) {}

    public void print(String message) {}

    public static void show() {
//        greet(LambdasDemo::print); // for static methods
//        var demo = new LambdasDemo("hi");
//        greet(demo::print); // non static
        greet(LambdasDemo::new); // constructor
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }


}
