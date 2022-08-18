package com.example._03_pausing_a_thread;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        try {
            Thread.sleep(3000); // Pause for 3 seconds
        } catch (InterruptedException e) {
            System.out.println("failed");
            e.printStackTrace();
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
