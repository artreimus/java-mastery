package com.example._06_comparable_interface;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        // this < other return -1
        // this == other return 0
        // this > other return (>=1)
        return name.compareTo(other.name);
    } // We can only compare numbers in if statements, to we use compareTo method!

    @Override
    public String toString() {
        return name;
    }
}
