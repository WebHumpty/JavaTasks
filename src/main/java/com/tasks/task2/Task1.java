package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 12: Введите в консоль два числа a и b.
 * Программа определяет наименьшее из них, либо сообщает, что числа равны.
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Min: " + b);
        } else if (a < b) {
            System.out.println("Min: " + a);
        } else if (a == b) {
            System.out.println("a равно b");
        }
    }
}
