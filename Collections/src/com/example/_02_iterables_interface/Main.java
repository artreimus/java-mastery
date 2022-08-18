package com.example._02_iterables_interface;

// interfac

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        var iterator = list.iterator();

        while(iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        for(var item : list) {
            System.out.println(item);
        }



    }
}