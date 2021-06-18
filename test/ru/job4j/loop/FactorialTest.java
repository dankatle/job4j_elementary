package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int fact = 5;
        int expected = 120;
        int result = Factorial.calc(fact);
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int fact = 0;
        int expected = 1;
        int result = Factorial.calc(fact);
        assertEquals(expected, result);
    }

}