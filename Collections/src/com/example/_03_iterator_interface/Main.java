package com.example._03_iterator_interface;

// Iterable = can be iterated
// Iterator = used to iterate
public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        var iterator = list.iterator();
        System.out.println(iterator);
        System.out.println(list);
        list.add("a");
        list.add("b");

        while(iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        for(var item : list) {
            System.out.println(item);
        }

    }
}