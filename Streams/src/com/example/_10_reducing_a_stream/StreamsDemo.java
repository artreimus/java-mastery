package com.example._10_reducing_a_stream;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

//        Optional<Integer> sum = movies.stream().map(m -> m.getLikes()).reduce((a, b) -> a + b); // reduce accumulates the stream from map. returns an Optional<>
//        System.out.println(sum.orElse(0)); // optional value of 0 if stream is empty. prints 70

//        Optional<Integer> sum = movies.stream().map(m -> m.getLikes()).reduce(Integer::sum); // Uses Integer.sum()
//        System.out.println(sum.orElse(0)); // optional value of 0 if stream is empty. prints 70

        Integer sum = movies.stream().map(m -> m.getLikes()).reduce(0, Integer::sum); // Has a default value of 0. Doesnt return an Optional<> anymore
        System.out.println(sum); // optional value of 0 if stream is empty. prints 70



    }
}
