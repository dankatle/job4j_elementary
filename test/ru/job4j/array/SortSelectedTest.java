package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {5, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {0, 1, 4, 123, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 4, 11, 123};
        assertArrayEquals(expected, result);
    }
}