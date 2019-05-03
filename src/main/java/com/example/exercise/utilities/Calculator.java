package com.example.exercise.utilities;

import java.util.Arrays;

public class Calculator {

    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int add(int... args) {
        return Arrays.stream(args).sum();
    }
}
