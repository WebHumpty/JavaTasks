package com.tasks.task4;

/**
 * Задача 73:
 * Программа округляет числа,
 * округляет числа в большую сторону,
 * округляет числа в меньшую сторону.
 */
public class Task4 {

    public static void main(String[] args) {
        double a = 1.4;
        double b = 1.7;
        double c, d, e, f, g, h;

        c = Math.round(a);
        d = Math.round(b);
        System.out.println("Округление " + a + " = " + c);
        System.out.println("Округление " + b + " = " + d);

        e = Math.ceil(a);
        f = Math.ceil(b);
        System.out.println("Округление в большую сторону: " + a + " = " + e);
        System.out.println("Округление в большую сторону: " + b + " = " + f);

        g = Math.floor(a);
        h = Math.floor(b);
        System.out.println("Округление в меньшую сторону: " + a + " = " + g);
        System.out.println("Округление в меньшую сторону: " + b + " = " + h);
    }
}
