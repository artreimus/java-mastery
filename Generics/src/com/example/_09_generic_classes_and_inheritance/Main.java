package com.example.generic_classes_and_inheritance;

public class Main {
    public static void main(String[] args) {
        User user = new Instructor(10);
        Utils.printUser(user);
        var users = new GenericList<User>();
        var instructors = new GenericList<Instructor>();
        Utils.printUsers(users);
    }
}