package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 79:
 * Программа считает длину окружности.
 * Используется константа PI (Пи).
 */
public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Введите число:");
        a = sc.nextInt();
        sc.close();
        System.out.println("Длинна окружности: " + 2 * Math.PI * Math.abs(a));
    }
}
