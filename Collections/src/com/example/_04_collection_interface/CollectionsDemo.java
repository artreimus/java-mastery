package com.example._04_collection_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        Collections.addAll(collection, "d", "e", "f");

//        for (var item : collection) {
//            System.out.println(item);
//        }

//        System.out.println(collection); // prints the whole collection
//        System.out.println(collection.size()); // returns the size
//        collection.remove("a"); // removes "a"
//        System.out.println(collection);
//        collection.clear(); // removes all elements in array
//        System.out.println(collection);
//        System.out.println(collection.isEmpty()); // check if empty
//        var containsA = collection.contains("a"); // check if collection contains "a"
//        System.out.println(containsA);
//        Object[] objectArray = collection.toArray(); // convert collection to an Array
//        var stringArray = collection.toArray(new String[0]); // converts to a string array. sets to 0 so that the array automatically sets its own size
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection == other); // returns false because they have different memory reference!
        System.out.println(collection.equals(other)); // returns true because it evaluates their content!
    }
}
