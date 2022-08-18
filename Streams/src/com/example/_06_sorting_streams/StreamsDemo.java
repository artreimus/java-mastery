package com.example._06_sorting_streams;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("a", 11),
                new Movie("c", 30)
        );

//        movies.stream().sorted((a, b) -> a.getTitle().compareTo(b.getTitle())).forEach(m -> System.out.println(m.getTitle())); // complex way of doing comparison
        movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(m -> System.out.println(m.getTitle())); // simpler way of doing it...

        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed()).forEach(m -> System.out.println(m.getTitle())); // reverse sorting of the list..



    }
}
