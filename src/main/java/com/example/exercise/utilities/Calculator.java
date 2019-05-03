package com.example.exercise.utilities;

import java.util.Arrays;

public class Calculator {

    public int add(int... args) {
        return Arrays.stream(args).sum();
    }
}
