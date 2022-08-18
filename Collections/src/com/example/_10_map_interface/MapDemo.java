package com.example._10_map_interface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        var customer = map.get("e1"); // we get null if object doesn't exist
        var unknown = new Customer("Unknown", "");
        var customer = map.getOrDefault("e1", unknown); // default return is the 2nd parameter
        System.out.println(customer);

        var exists = map.containsKey("e1"); // Checks if key exist, returns boolean
        System.out.println(exists);

        map.replace("e1", new Customer("a=++", "e1")); // Replaces object with key "e1"
        System.out.println(map);

        for (var key : map.keySet()) { // keySet returns the keys
            System.out.println(key);
        }

        for (var entry : map.entrySet()) { // gets all entries
            System.out.println(entry);
        }

        for (var entry : map.entrySet()) { // gets all entries
            System.out.println(entry.getKey()); // get the key from the set
        }


        for (var entry : map.entrySet()) { // gets all entries
            System.out.println(entry.getValue()); // gets the value from the set
        }

        for (var x : map.values()) { // gets all entries
            System.out.println(x);
        }


    }
}
