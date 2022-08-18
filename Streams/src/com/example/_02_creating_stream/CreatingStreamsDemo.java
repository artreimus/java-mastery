package com.example._02_creating_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
     public static void show() {
         Collection<Integer> collection;
    //     collection.stream();

         var list = new ArrayList<>();
         list.stream();

         int[] numbers = {1, 2, 3};
         Arrays.stream(numbers).forEach(n -> System.out.println(n));

//         Stream.of(1, 2, 3, 4);
         var stream = Stream.generate(() -> Math.random());
         stream.limit(3).forEach(n -> System.out.println(n)); // it produces an infinite number of n so we use the limit() method

         Stream.iterate(1, n -> n + 1).limit(10).forEach(n -> System.out.println(n));
     }
}
