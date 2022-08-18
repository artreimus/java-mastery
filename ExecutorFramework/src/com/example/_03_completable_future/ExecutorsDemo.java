package com.example._03_completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class ExecutorsDemo {
    public static void show() {
        //        CompletableFuture.runAsync(); // run this task in asynchronous way...
        // we must pass a runnable + executor.
        // if you don't have an executor this method is going to run it in a common pool (ForkJoinPool.commonPool())


//        Runnable task = () -> System.out.println("a");
//        var future = CompletableFuture.runAsync(task); // returns void

        Supplier<Integer> task = () -> 1;
        var future = CompletableFuture.supplyAsync(task); // returns a CompletableFuture<T>
        try {
            var result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }


}
