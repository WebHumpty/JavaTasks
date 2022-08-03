package com.tasks.task1;

import java.util.Scanner;

/**
 * Задача 9: Программа выводит число, обратное числу, введенному пользователем.
 */
public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = -sc.nextInt();
        sc.close();
        System.out.println("Обратное число: " + a);
    }
}
