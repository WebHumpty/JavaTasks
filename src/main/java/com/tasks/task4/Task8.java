package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 77:
 * Программа определяет максимальное значение
 * из двух введенных пользователем.
 */
public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int max;

        System.out.print("Введите число:");
        a = sc.nextInt();
        System.out.print("Введите число:");
        b = sc.nextInt();
        sc.close();

        max = Math.max(a, b);
        System.out.println("Максимальное число: "  + max);
    }
}
