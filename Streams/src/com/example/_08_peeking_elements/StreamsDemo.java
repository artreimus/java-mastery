package com.example._08_peeking_elements;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream().filter(m -> m.getLikes() > 10).map(Movie::getTitle).forEach(System.out::println);


        // peek() Allows us to peek through the data while processing.. :)
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle).peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);



    }
}
