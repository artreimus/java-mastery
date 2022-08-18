package com.example._01_imperative_vs_functional_programming;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 11),
                new Movie("c", 13)
        );


        //Imperative programming
        int count = 0;
        for(var movie : movies) {
            if (movie.getLikes() > 10) count++;
        }

        //Declarative Programming
        var countTwo = movies.stream().filter(movie -> movie.getLikes() > 10).count();

    }
}
