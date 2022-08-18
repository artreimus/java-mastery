package com.example._12_atomic_objects;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        var status = new DownloadStatus();


        List<Thread> threads = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status)); // Created a new thread
            thread.start();
            threads.add(thread);
        }

        for(var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(status.getTotalBytes());
    }
}
