package com.example._01_executor;

import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);
        System.out.println(executor.getClass().getName());

        // We need to place it inside a try finally block to properly shutdown the executor if program throws an error.
        try {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            }); // submit a task to the thread pool
        } finally {
            executor.shutdown(); // shutdowns the executor after all tasks are done
            //        executor.shutdownNow(); // forces the executor to shutdown
        }





    }


}
