package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int n = 0; n < array.length; n++) {
            array[n] = n * 2 + 3;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
