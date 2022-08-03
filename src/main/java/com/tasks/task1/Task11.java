package com.tasks.task1;

import java.util.Scanner;

/**
 * Задача 10: Программа выводит квадрат числа, введенного пользователем.
 */
public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Квадрат числа: " + (a * a));
    }
}
