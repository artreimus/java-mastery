package com.example._04_joining_a_thread;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        System.out.println(Thread.currentThread().getName());


        for(var i = 0; i < 3; i++) {
            Thread thread = new Thread(new DownloadFileTask()); // Created a new thread
            thread.start(); // runs the thread..

            try {
                thread.join(); // Waits for thread to wait for the completion of another thread.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("File is ready to be scanned");
        }
    }
}
