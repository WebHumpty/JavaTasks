package com.tasks.task4;

/**
 * Задача 75:
 * Программа переводит радианы
 * в градусы и градусы в радианы.
 */
public class Task6 {

    public static void main(String[] args) {
        double a = 1;
        double b = 180;
        double c, d;

        c = Math.toDegrees(a);
        d = Math.toRadians(b);

        System.out.println(a + " радиан = " + c + " градусов");
        System.out.println(b + " градусов = " + d + " радиан");
    }
}
