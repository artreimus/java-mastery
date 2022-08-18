package com.example._09_combining_completable_futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {
        // 20 usd to euro (0.9)
//        var first = CompletableFuture.supplyAsync(() -> 20);
//        var second = CompletableFuture.supplyAsync(() -> 0.9);
//        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
//                .thenAccept(result -> System.out.println(result));



        var first = CompletableFuture.supplyAsync(() -> "20USD")
                .thenApply(str -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                }); // convert 20USD to 20


        var second = CompletableFuture.supplyAsync(() -> 0.9);
        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(result -> System.out.println(result));
    }
}
