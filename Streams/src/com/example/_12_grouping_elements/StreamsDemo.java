package com.example._12_grouping_elements;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );


        var result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));
        System.out.println(result);

        var resultTwo = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
        System.out.println(resultTwo); // returns # instead of objects

        var resultThree = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
        // collector ( get the movie, get the title, join the title)
        System.out.println(resultThree);




    }
}
