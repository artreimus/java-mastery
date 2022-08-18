package com.example._11_thread_signaling;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        var status = new DownloadStatus();

        var threadOne = new Thread(new DownloadFileTask(status));
        var threadTwo = new Thread(() -> {
            while(!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait(); // puts this thread to sleep until another thread wakes it up!
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });

        threadOne.start();
        threadTwo.start();

    }
}
