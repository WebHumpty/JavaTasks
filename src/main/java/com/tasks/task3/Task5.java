package com.tasks.task3;

import java.util.Scanner;

/**
 * Задача 43: Пользователь вводит число от 1 до 999.
 * Программа выводит все числа между 0
 * и введенным числом или выдает сообщение об ошибке.
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 999:");
        int n = sc.nextInt();
        sc.close();

        if (1 > n || n > 999) {
            System.out.println("Число должно быть между 1 до 999");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
