package com.tasks.task3;

/**
 * Задача 47: Программа создает массив
 * и наполняет его случайными числами от 1 до 10.
 * После этого программа выводит этот массив
 */
public class Task9 {

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 100 + 1);
            System.out.print(a[i]);
            if (i == 9) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
        }
    }
}
