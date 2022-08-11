package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 72: Программа вычисляет корни кубические двух чисел,
 * введенных пользователем.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Введите число:");
        a = sc.nextInt();
        System.out.print("Введите число:");
        b = sc.nextInt();
        sc.close();

        double c;
        double d;
        c = Math.cbrt(a);
        d = Math.cbrt(b);

        System.out.println("Кубический корень: " + a + " = " + c);
        System.out.println("Кубический корень: " + b + " = " + d);
    }
}
