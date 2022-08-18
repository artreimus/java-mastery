package com.example._01_imperative_vs_functional_programming;

public class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }


    public int getLikes() {
        return likes;
    }
}
