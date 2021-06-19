package ru.job4j.array;

import static ru.job4j.array.SwitchArray.*;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            swap(data, index, i);
        }
        return data;
    }
}
