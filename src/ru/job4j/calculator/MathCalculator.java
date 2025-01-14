package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double  first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSub(double first, double second) {
        return div(first, second)
                + sub(first, second);
    }

    public static double allOperations(double first, double second) {
        return sumAndMultiply(first, second)
                + divAndSub(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
