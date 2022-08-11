package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 76:
 * Программа определяет минимальное значение
 * из двух чисел, введенных пользователем.
 */
public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int min;

        System.out.print("Введите число:");
        a = sc.nextInt();
        System.out.print("Введите число:");
        b = sc.nextInt();
        sc.close();

        min = Math.min(a, b);
        System.out.println("Минимальное число: " + min);
    }
}
