package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 26: Программа выдает абсолютное значение числа, введенного пользователем.
 */
public class Task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = sc.nextInt();
        sc.close();

        int a = n < 0 ? -n : n;
        System.out.println("Абсолютное число: " + n + " равно " + a);
    }
}
