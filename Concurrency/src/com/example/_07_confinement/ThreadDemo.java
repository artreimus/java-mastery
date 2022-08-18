package com.example._07_confinement;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task); // Created a new thread
            thread.start();
            threads.add(thread);
        }


        for(var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce(0, (a,b) -> a+b);
        var totalBytes = tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce(Integer::sum); // similar above

        System.out.println(totalBytes);


    }
}
