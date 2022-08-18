package com.example._05_list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!"); // Add at index 0
        Collections.addAll(list, "a", "b", "c", "a");
        System.out.println(list.get(0)); // Getting element at index 0
        list.set(0, "a+"); // Replacing element at index 0
        System.out.println(list);
        list.remove(0); // remove element at index 0
        System.out.println(list);
        System.out.println(list.indexOf("a")); // returns index of a. returns -1 if element doesnt index
        System.out.println(list.lastIndexOf("a")); // returns the last index of "a"
        System.out.println(list.subList(0, 2)); // get item from index 0 to index 1 (from, to). original list is not changed because it returns a new list


    }
}
