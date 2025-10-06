package com.example.demo.util;


public abstract class IdSequencer {
    private static long id = 0;

    public static long getId() {
        return ++id;
    }
}
