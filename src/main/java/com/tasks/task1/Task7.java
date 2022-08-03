package com.tasks.task1;

import java.util.Scanner;

/**
 * Задача 6: Программа выводит число, введенное пользователем.
 */
public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Введенное число: " + a);
    }
}
