package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 20: Введите в консоль число.
 * Программа определяет число больше, меньше или равно 0
 */
public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = sc.nextInt();
        sc.close();
        if (n > 0) {
            System.out.println(n + " > 0");
        } else if (n < 0) {
            System.out.println(n + " < 0");
        } else if (n == 0) {
            System.out.println(n + " = 0");
        }
    }
}
