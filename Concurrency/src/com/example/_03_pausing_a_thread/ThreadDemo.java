package com.example._03_pausing_a_thread;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for(var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask()); // Created a new thread
            thread.start(); // runs the thread..
        }
    }
}
