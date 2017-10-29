package main.chapter5.item28_generics;

interface Function<T> {
    T apply(T arg1, T arg2);
}