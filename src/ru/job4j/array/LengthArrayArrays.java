package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
        System.out.println();
        int[][] matrix = {{1}, {5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + matrix[i].length
            );
        }
    }
}
