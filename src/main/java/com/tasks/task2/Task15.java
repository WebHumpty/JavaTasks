package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 27: Программа выводит минимальное число из двух чисел, введенных пользователем.
 */
public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();
        sc.close();

        int r = a > b ? b : a;
        System.out.println("Минимальное число: " + r);
    }
}
