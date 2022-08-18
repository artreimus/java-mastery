package com.example;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {

    public Stream <CompletableFuture<Quote>> getQuotes() {
        var sites = List.of("site1", "site2", "site3");
        return sites.stream().map(site -> getQuote(site));
    }

    public CompletableFuture<Quote> getQuote(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("getting a quote from " + site);
            var random = new Random();
            var price = 100 + random.nextInt(10); // returns 0 - 10
            LongTask.simulate(1_000 + random.nextInt(2_000)); // 1 to 3 seconds. random
            return new Quote(site, price);
        });
    }
}
