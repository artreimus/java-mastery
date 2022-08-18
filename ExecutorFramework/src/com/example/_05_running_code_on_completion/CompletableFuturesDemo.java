package com.example._05_running_code_on_completion;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenRun(() -> System.out.println("Done")); // run the code once the task is finished...
//        future.thenRunAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//        }); // run the code task in an asynchronous way...

//        future.thenAccept(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);
//        } ); // useful for getting the result of the Future object..

        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        } ); // async way of processing result


    }

}
