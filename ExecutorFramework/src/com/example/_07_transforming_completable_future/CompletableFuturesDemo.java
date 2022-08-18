package com.example._07_transforming_completable_future;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {


    public static int toFahrenheit(int celsius) {
        return (int)(celsius * 1.8) + 32;
    }

    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);
        future
//              .thenApply(celsius -> CompletableFuturesDemo.toFahrenheit(celsius))
                .thenApply(CompletableFuturesDemo::toFahrenheit) // same as above
                .thenAccept(f -> System.out.println(f)); // convert c to f
    }

}
