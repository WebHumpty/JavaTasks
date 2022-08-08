package com.tasks.task3;

import java.util.Scanner;

/**
 * Задача 58: Программа формирует массив, состоящий из чисел от 1 до 10.
 * Пользователь вводит число.
 * Программа сообщает сколько раз встречается введенное число в массиве.
 */
public class Task20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = (int)(Math.random() * 10 + 1);
        }

        System.out.print("Введите число:");
        int x = sc.nextInt();
        sc.close();

        int num = 0;

        for (int v : numbers) {
            if (v == x) {
                num += 1;
            }
        }

        System.out.println(x + " повторяется " + num + " раз");
    }
}
