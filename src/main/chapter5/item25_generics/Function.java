package main.chapter5.item25_generics;

interface Function<T> {
    T apply(T arg1, T arg2);
}