package com.example._14_synchronized_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ThreadDemo {
    // Runnable object to be run in the thread
    public static void show() {
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>()); // sychoronous collection
        // use sychronous collections when 2 list are racing...

        var threadOne = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });

        var threadTwo = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(collection);


    }
}