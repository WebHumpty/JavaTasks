package com.tasks.task1;

import java.util.Scanner;

/**
 * Задача 8: Программа выводит разность чисел, введенных пользователем.
 */
public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Разность: " + (a - b));
    }
}
