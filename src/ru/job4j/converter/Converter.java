package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(700);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("700 rubles are " + dollars + " dollar.");
    }
}