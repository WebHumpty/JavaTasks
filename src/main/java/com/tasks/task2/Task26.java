package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 38: Программа считает количество повторов
 * цикла от 0 до числа, введенного пользователем.
 */
public class Task26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        sc.close();
        int i = 0;
        do {
            System.out.println("Повтор: " + i);
            i++;
        } while (i < (a - 1));
    }
}
