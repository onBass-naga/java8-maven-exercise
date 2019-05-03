package com.example.exercise;

import com.example.exercise.utilities.Calculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = Arrays.stream(args).mapToInt(Integer::valueOf).toArray();

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(numbers));
    }
}
