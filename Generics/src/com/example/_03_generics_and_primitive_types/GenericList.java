package com.example.generics_and_primitive_types;

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get (int index) {
        return items[index];
    }
}
