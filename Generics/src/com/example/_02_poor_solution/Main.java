package com.example.poor_solution;

public class Main {
    public static void main(String[] args) {
        var list = new List();

        // Problems:
        //
        list.add(Integer.valueOf(1));
        list.add("1");
        list.add(new User());
        int number = (int) list.get(1); // we need to cast it pa! and this causes errors din if the datatype is not for numbers! poor solution!
    }
}