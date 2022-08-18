package com.example._08_composing_completable_futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getUserPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }


    public static void show() {
        // get email - get playlist using email -
//        var future = CompletableFuture.supplyAsync(() -> "email")
//                .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist")) // we must pass in another completable future...
//                .thenAccept(playlist -> System.out.println(playlist));

        // refactored:
        getUserEmailAsync().thenCompose(CompletableFuturesDemo::getUserPlaylistAsync).thenAccept(playlist -> System.out.println(playlist));
    }

}
