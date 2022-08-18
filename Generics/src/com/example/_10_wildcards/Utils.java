package com.example.wildcards;

public class Utils {
    public static <T extends Comparable <T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? first : second;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }
// class CAP#1 extends User {}
//    class Instructor also extends User
    public static void printUsers(GenericList<? extends User> users) { // if you want to add to the list user super, if you want to read use extends!
        User x = users.get(0);
    }


}
