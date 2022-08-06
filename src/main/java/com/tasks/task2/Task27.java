package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 39: Программа считает квадраты чисел от 1 до числа,
 * введенного пользователем.
 * Число, введенное пользователем,
 * не должно выходить за рамки диапозона от 1 до 10.
 */
public class Task27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();

        if (1 > a || a > 10) {
            System.out.println("Число должно быть между 1 и 10");
        } else {
            int i = 1;
            do {
                System.out.println("Квадрат " + i + " равен: " + (i * i));
                i++;
            } while (i < (a + 1));
        }
    }
}
