package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 80:
 * Программа по двум катетам определяет гипотенузу треугольника.
 */
public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.print("Введите число:");
        a = sc.nextInt();
        System.out.print("Введите число:");
        b = sc.nextInt();
        sc.close();

        double g = Math.hypot(a, b);
        System.out.print("Гипотенуза треугольника с катетами ");
        System.out.println(a + " и " + b + " = " + g);
    }
}
