package com.example._02_callables_and_futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);
        System.out.println(executor.getClass().getName());

        // We need to place it inside a try finally block to properly shutdown the executor if program throws an error.
        try {
            var future = executor.submit(() -> { // Future - async class. interface that represents the future result of an operation.
                LongTask.simulate();
                return 1;
            }); // submit a task to the thread pool
            System.out.println("Do more work...");
            try {
                var result = future.get(); // block the current thread, and wait until it returns a value..
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        } finally {
            executor.shutdown(); // shutdowns the executor after all tasks are done
            //        executor.shutdownNow(); // forces the executor to shutdown
        }





    }


}
