package com.example.comparable_interface;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // this < o return -1
        // this == 0 return 0
        // this > 0 return (>=1)
//        if(points < other.points) return -1;
//        if(points == other.points) return 0;
//        if(points > other.points) return 1;

        return points - other.points; //  Simplified way of doing comparison!
    }
}
