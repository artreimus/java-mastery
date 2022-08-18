package com.example._04_async_api;

public class Main {
    public static void main(String[] args) {
        var service = new MailService();
        service.sendAsync();
        System.out.println("Hello world");
        // even if we don't see the results... it's okay since this is only a CLI application that gets terminated..
        // in the real world, the user doesn't terminate the app
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}