package com.example._13_binary_operators;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdasDemo {

    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;
//        var result = add.apply(1,2);
        var result = add.andThen(square).apply(1,2);
        System.out.println(result);

    }



}
