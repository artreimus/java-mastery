package com.example.generics_and_primitive_types;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing - The Compiler automatically converts the int to Integer
        int number = numbers.get(0); // Unboxing - converts Integer back to int ~

    }
}