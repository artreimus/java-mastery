package com.example._11_thread_signaling;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for(var i = 0; i < 1_000_000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.done();
        synchronized (status) {
            status.notifyAll(); // notifies the other thread!
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
