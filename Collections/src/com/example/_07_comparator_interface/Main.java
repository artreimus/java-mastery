package com.example._07_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Iterable = can be iterated
// Iterator = used to iterate
public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers); // customers class must implement comparable interface
        System.out.println(customers); // we need to override toString method in Customer to print in console
        Collections.sort(customers, new EmailComparator()); // sorts the customers list based on emails because we used the emailComparator
        System.out.println(customers);

    }
}