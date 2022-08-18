package com.example._09_simple_reducers;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        var result = movies.stream().anyMatch(m -> m.getLikes() > 20);
        System.out.println(result);

        result = movies.stream().allMatch(m -> m.getLikes() > 20); // if every element satisfies the condition
        System.out.println(result);

        result = movies.stream().noneMatch(m -> m.getLikes() > 20); // if none from the list matches the predicate..
        System.out.println(result);

        var resultTwo = movies.stream().findFirst().get(); // finds first element
        System.out.println(resultTwo.getTitle());

        resultTwo = movies.stream().findAny().get(); // finds any element
        System.out.println(resultTwo.getTitle());


        resultTwo = movies.stream().max(Comparator.comparing(Movie::getLikes)).get(); // finds movie with max likes
        System.out.println(resultTwo.getTitle());
    }
}
