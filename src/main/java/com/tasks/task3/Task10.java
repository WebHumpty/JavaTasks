package com.tasks.task3;

import java.util.Scanner;

/**
 * Задача 48: Пользователь вносит число от 1 до 10.
 * Программа создает массив размером с число,
 * введенным пользователем, заполняет его
 * случайным образом и выводит массив
 */
public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = sc.nextInt();
        sc.close();

        if (1 > n || n > 10) {
            System.out.println("Число должно быть от 1 до 10");
        } else {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = (int)(Math.random() * 10 + 1);
                System.out.print(a[i]);
                if (i == (n - 1)) {
                    System.out.print(".");
                } else {
                    System.out.print(",");
                }
            }
        }
    }
}
