package com.example._10_map_interface;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }
}
