package com.example.comparable_interface;

import java.util.Comparator;

public class GenericList<T extends Comparable & Comparator> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get (int index) {
        return items[index];
    }
}
