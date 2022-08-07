package com.tasks.task3;

/**
 * Задача 45: Программа выводит квадраты чисел от 1 до 10,
 * потом, с другой строчки, квадраты чисел от 10 до 1
 */
public class Task7 {

    public static void main(String[] args) {
        int i, n = 10;

        for (i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
        for (i = n; i > 0; i--) {
            System.out.print((i * i) + " ");
        }
    }
}
