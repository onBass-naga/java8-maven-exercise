package com.example.exercise.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void 引数を2つ渡して足し算ができる() {
        Calculator sut = new Calculator();
        int actual = sut.add(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void 可変長引数を渡して足し算ができる() {
        Calculator sut = new Calculator();
        int actual = sut.add(1, 2, 3, 4, 5);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void 引数が0個の場合の結果は0になる() {
        Calculator sut = new Calculator();
        int actual = sut.add(1, 2, 3, 4, 5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}