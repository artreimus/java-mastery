package com.example._09_function_interface;

import java.util.function.Function;

public class LambdasDemo {

    public LambdasDemo(String message) {}

    public void print(String message) {}

    public static void show() {
        Function<String, Integer> map = str -> str.length();
        System.out.println(map.apply("Sky"));
    }
}
