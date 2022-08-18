package com.example._13_adders;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalBytes() {
        return totalBytes.intValue(); // gets the sum and convert to int
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
