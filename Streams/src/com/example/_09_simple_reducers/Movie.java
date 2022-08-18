package com.example._09_simple_reducers;

public class Movie implements Comparable<Movie> {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }


}
