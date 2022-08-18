package com.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFuturesDemo {
    public static void show() {
        var start = LocalTime.now(); // returns current time

        var service = new FlightService();
        var futures = service.getQuotes()
                .map(future -> future.thenAccept(quote -> System.out.println(quote)))
                .collect(Collectors.toList());
        // we should pass a function that takes a completable future of quote and print it
        // collect is the terminal method of the streams

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start, end); // returns a Duration obj
                    System.out.println("Retrieved all quotes in " + duration.toMillis() + " msec"); // return in milliseconds
                }); // CompletableFuture Array that is initially dynamic

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
