package com.example.generic_classes_and_inheritance;

public class KeyValuePair <K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}