package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = EqLast.check(left, right);
        assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = EqLast.check(left, right);
        assertFalse(result);
    }

}