package com.example._10_volatile_keyword;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        var status = new DownloadStatus();

        var threadOne = new Thread(new DownloadFileTask(status));
        var threadTwo = new Thread(() -> {
            while(!status.isDone()) {}
            System.out.println(status.getTotalBytes());
        });

        threadOne.start();
        threadTwo.start();

    }
}
