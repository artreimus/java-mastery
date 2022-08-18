package com.example._01_iterables;

// interfac

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item : list.items) {
            System.out.println(item);
        }
        list.items[0] = "a";
        System.out.println(list.items.length);
    }
}