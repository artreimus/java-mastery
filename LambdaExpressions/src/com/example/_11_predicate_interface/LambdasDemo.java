package com.example._11_predicate_interface;

import java.util.function.Predicate;

public class LambdasDemo {

    public static void show() {
        // sky = check if it has five char
        Predicate<String> isLongerThanFive = str -> str.length() > 5;
        var result = isLongerThanFive.test("sky");
    }
}
