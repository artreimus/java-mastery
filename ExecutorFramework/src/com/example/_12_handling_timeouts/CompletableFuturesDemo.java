package com.example._12_handling_timeouts;

import com.example._11_waiting_for_first_task.LongTask;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
//            var result = future.orTimeout(1, TimeUnit.SECONDS).get(); // wait in seconds. wait 1 second
//            //  going to get an error because Longtask.simulate takes 3 secs!
            var result = future.completeOnTimeout(1, 1, TimeUnit.SECONDS)
                    .get(); // same as above but with default value (1)
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
