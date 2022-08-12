package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 78:
 * Программа определяет модуль числа,
 * введенного пользователем,
 * и модуль обратного числа.
 */
public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Введите число:");
        a = sc.nextInt();
        b = -a;

        System.out.println("Число: " + a + ", обратное число = " + b);
        System.out.println("Модуль числа: " + Math.abs(a) + ", модуль обратного числа = " + Math.abs(b));
    }
}
