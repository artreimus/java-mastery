package com.example._07_getting_unique_elements;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream().map(m -> m.getLikes()).forEach(System.out::println); // gets the likes
        movies.stream().map(m -> m.getLikes()).distinct().forEach(System.out::println); // gets the unique list of values


    }
}
