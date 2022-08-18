package com.example._06_consumer_interface;

import java.util.List;

public class LambdasDemo {

    public LambdasDemo(String message) {}

    public void print(String message) {}

    public static void show() {
        List<Integer> list = List.of(1,2,3);
        list.forEach(item -> System.out.println(item));


    }
}

