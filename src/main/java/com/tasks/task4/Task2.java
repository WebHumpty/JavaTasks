package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 71: Программа вычисляет корни квадратные двух чисел, введенных пользователем.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, c;
        System.out.print("Введите число:");
        a = sc.nextInt();
        System.out.print("Введите число:");
        c = sc.nextInt();
        sc.close();

        double b;
        double d;
        b = Math.sqrt(a);
        d = Math.sqrt(c);

        System.out.println("Квадратный корень: " + a + " = " + b);
        System.out.println("Квадратный корень: " + c + " = " + d);
    }
}
