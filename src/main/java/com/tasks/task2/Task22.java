package com.tasks.task2;

/**
 * Задача 34: Дан прямоугольный треугольник со сторонами 3, 4 и 5 см.
 * Программа определяет гипотенузу и выводит площадь треугольника.
 */
public class Task22 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        double square = 0;

        if (a > b && a > c) {
            square = b * c / 2;
        }
        if (b > a && b > c) {
            square = a * c / 2;
        }
        if (c > a && c > b) {
            square = a * b / 2;
        }

        System.out.println("Площадь равна: " + square);
    }
}
