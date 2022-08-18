package com.example._11_waiting_for_first_task;

import com.example._02_callables_and_futures.LongTask;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {

        //getting weather
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(() -> 20);

        var fastest = CompletableFuture.anyOf(first, second)
                .thenAccept(temp -> System.out.println(20));

        // returns something if any of the parameter complete their task!

    }
}
