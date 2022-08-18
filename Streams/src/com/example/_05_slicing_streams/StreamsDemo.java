package com.example._05_slicing_streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 11),
                new Movie("c", 30)
        );

//        movies.stream().limit(2).forEach(m -> System.out.println(m.getTitle())); // only shows first 2 index
//        movies.stream().skip(2).forEach(m -> System.out.println(m.getTitle())); // only gets index 2 (c in this case)

//        movies.stream().skip(20).limit(10).forEach(m -> System.out.println(m.getTitle())); // skips first 20 items and only shows 10 items

        movies.stream().takeWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle())); // take elements from List as long as element likes < 30
        // outputs first 2 movies in this case... takeWhile is different from filter method because it only iterates until it encounters false...
        movies.stream().dropWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle())); // opposite of takeWhile! it will drop first 2 elements because they are < 30.


    }
}
