package com.example._12_atomic_objects;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet(); // ++totalBytes
//        totalBytes.getAndIncrement()  // totalBytes++
    }

    public int getTotalBytes() {
        return totalBytes.get();
    }
}
