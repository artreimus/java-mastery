package com.example._14_primitive_type_streams;

import java.util.stream.IntStream;

public class StreamsDemo {
    public static void show() {
// range = non inclusive
// range close = upperbound is inclusive
        IntStream.range(1, 5).forEach(System.out::println); // 1-4
        IntStream.rangeClosed(1, 5).forEach(System.out::println); // 1-5
    }
}
