package ru.geekbrains.lesson1.Dao;

public class Task2 {
    public static void main(String[] args) {
        double result = evaluateExpression(2, 1, 2, 3);

        System.out.println(result);
    }

    private static int evaluateExpression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
