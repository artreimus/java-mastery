package com.example._08_supplier_interface;

import java.util.function.Supplier;

public class LambdasDemo {

    public LambdasDemo(String message) {}

    public void print(String message) {}

    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }

}
