package com.example._08_queue_interface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
//        queue.add("c");
//        queue.add("a");
//        queue.add("b");
//        queue.offer("d");
//        System.out.println(queue); // [c, a, b, d]
        // add = throws an exception if queue is full
        // offer = throws a false when queue is full
//        var front = queue.peek(); // peek returns a null if queue is empty.
//        System.out.println(front); // outputs c

//        var front = queue.element(); // element throws an exception if queue is empty.
//        System.out.println(front); // throws an exception if empty

//        var front = queue.remove(); // removes the first in the queue (c in this instance). throws an exception if empty
//        System.out.println(front); // outputs c
//        System.out.println(queue); // outputs [a, b, d]

        var front = queue.poll(); // also removes the first in queue. returns null if queue is empty.
        System.out.println(front); // outputs c
        System.out.println(queue); // outputs [a, b, d]

    }
}
