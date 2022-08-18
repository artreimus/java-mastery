package com.example._10_composing_functions;

import java.util.function.Function;

public class LambdasDemo {

    public LambdasDemo(String message) {}

    public void print(String message) {}

    public static void show() {

        // "key: value"
        // first" "key=value"
        // second: "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        var result = replaceColon.andThen(addBraces).apply("key: value");
        System.out.println(result);
        result = addBraces.compose(replaceColon).apply("key:value"); // same as andThen but in reverse!
        System.out.println(result);

    }
}
