package com.example._11_collectors;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        var result = movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toList()); // convert stream to a list!
        var resultTwo = movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toSet()); // convert stream to a set!        var result = movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toList()); // convert stream to a list!
        var resultThree = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes())); // convert stream to a map! sets title as key, and likes as value

        var resultFour = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes)); // refactored ;)
        System.out.println(resultFour);


        var resultFive = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, m -> m )); // results the object as the value
        System.out.println(resultFive);


        var resultSix = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Function.identity() )); // results the object as the value. refactored version. better than resultFive
        System.out.println(resultSix);

        var resultSeven = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes)); // get the sum of likes
        System.out.println(resultSeven);

        var resultEight = movies.stream().filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes)); // summarizes the list
        System.out.println(resultEight);

        var resultNine = movies.stream().filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", ")); // combines the title and separates them with the delimiter ("," in this case)
        System.out.println(resultNine);


    }
}
