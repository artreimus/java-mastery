package com.example._12_combining_predicates;

import java.util.function.Predicate;

public class LambdasDemo {

    public static void show() {
        // sky = check if it has five char
        Predicate<String> hasLeftBraces = str -> str.startsWith("{");
        Predicate<String> hasRightBraces = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBraces = hasLeftBraces.and(hasRightBraces);
        hasLeftAndRightBraces.test("{key:value}"); // returns true
        Predicate<String> hasLeftOrRightBraces = hasLeftBraces.or(hasRightBraces);
        hasLeftOrRightBraces.test("{key:value}"); // returns true
        Predicate<String> hasLeftNotRightBraces = hasLeftBraces.negate();
        hasLeftNotRightBraces.test("{key:value}"); // returns true


    }
}
