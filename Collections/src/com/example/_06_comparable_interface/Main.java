package com.example._06_comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Iterable = can be iterated
// Iterator = used to iterate
public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        Collections.sort(customers); // customers class must implement comparable interface
        System.out.println(customers); // we need to override toString method in Customer to print in console
    }
}