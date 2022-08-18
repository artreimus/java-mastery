package com.example._14_synchronized_collections;

public class DownloadStatus {
    private int totalBytes;

    public void incrementTotalBytes() {
        totalBytes++; // Non atomic operation - involves multiple steps
        // 3 steps:
        // 1. value of the field is to be read from the memory.
        // 2. the cpu increments the value.
        // 3. the updated value saves the updated value in the memory.
    }


    public int getTotalBytes() {
        return totalBytes;
    }
}
