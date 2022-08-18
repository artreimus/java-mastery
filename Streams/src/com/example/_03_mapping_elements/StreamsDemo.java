package com.example._03_mapping_elements;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(new Movie("a", 10), new Movie("b", 11), new Movie("c", 12));
        // We only want the names of the movie
        movies.stream().map(movie -> movie.getTitle()).forEach(title -> System.out.println(title));


        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
//        stream.forEach(list -> System.out.println(list)); // returns the 2 lists
        stream.flatMap(list -> list.stream()).forEach(n -> System.out.println(n)); // returns all the elements of the list individually.
    }
}
