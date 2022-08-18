package com.example._09_set_interface;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set); // the order of element is not guaranteed!

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> setTwo = new HashSet<>(collection); // removes the duplicates from the Collection
        System.out.println(setTwo);


        Set<String> setThree = new HashSet<>(Arrays.asList("a", "b", "c", "c"));
        Set<String> setFour = new HashSet<>(Arrays.asList("b", "c", "d", "c"));
//        setThree.addAll(setFour); // Union (Combination of sets)
//        setThree.retainAll(setFour); // Intersection. Gives us the items that are common between 2 sets
        setThree.removeAll(setFour); // Difference. Keeps everything that is unique in first Set
        System.out.println(setThree);
    }
}
