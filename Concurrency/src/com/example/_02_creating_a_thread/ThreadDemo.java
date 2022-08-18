package com.example._02_creating_a_thread;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        for(var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask()); // Created a new thread
            thread.start(); // runs the thread..
        }
    }
}
