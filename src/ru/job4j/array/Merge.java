package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int minLeft = 0;
        int minRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (minLeft != left.length && minRight != right.length) {
                if (left[minLeft] < right[minRight]) {
                    rsl[i] = left[minLeft++];
                } else {
                    rsl[i] = right[minRight++];
                }
            } else if (minLeft == left.length) {
                rsl[i] = right[minRight++];
            } else {
                rsl[i] = left[minLeft++];
            }
        }
        return rsl;
    }
}
