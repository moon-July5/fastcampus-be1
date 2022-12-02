package me.day20.generic.implement;


public interface Storage<T> {
    void add(T item);
    T get(int index);
    void remove(T item);
}
