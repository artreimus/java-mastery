package com.example._09_synchronization;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();


    public void incrementTotalBytes() {
//        synchronized (this) { // this a bad practice, there will be problem with incrementTotalFiles!
//            // we can't use synchronized(this) twice! we should use dedicated monitor Objects instead...
//            totalBytes++;
//        }

        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public void incrementTotalFiles() {
//        synchronized (this) { // bad practice
//            totalFiles++;
//        }

        synchronized (totalFilesLock) {
            totalFiles++;
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}
