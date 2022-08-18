package com.example._05_interrupting_a_thread;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        Thread thread = new Thread(new DownloadFileTask()); // Created a new thread
        thread.start(); // runs the thread..
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt(); // sends an interrupt request. doesn't force the thread to start. it's up to the thread to decide whether it wants to stop.

    }
}
