package com.example._04_filtering_elements;

import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 11),
                new Movie("c", 13)
        );

        // Intermediate: returns a new stream
        // Terminal: must ba called to end the stream. these are consumes (e.g: forEach())

        movies.stream().filter(m -> m.getLikes() > 10).forEach(m -> System.out.println(m.getTitle()));

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream().filter(isPopular).forEach(m -> System.out.println(m.getTitle())); // cleaner way of doing it! we declare the predicate kasi


    }
}
