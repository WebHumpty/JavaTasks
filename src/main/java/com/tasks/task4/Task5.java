package com.tasks.task4;

/**
 * Задача 74:
 * Программа вычисляет тригонометрические функции числа a,
 * заданного в радианах.
 */
public class Task5 {

    public static void main(String[] args) {
        double a = 0.5;
        double b, c, d, e, f, g;

        b = Math.sin(a);
        c = Math.cos(a);
        d = Math.tan(a);
        e = Math.asin(a);
        f = Math.acos(a);
        g = Math.atan(a);

        System.out.println("Sin: " + a + " = " + b);
        System.out.println("Cos: " + a + " = " + c);
        System.out.println("Tan: " + a + " = " + d);
        System.out.println("Asin: " + a + " = " + e);
        System.out.println("Acos: " + a + " = " + f);
        System.out.println("Atan: " + a + " = " + g);
    }
}
