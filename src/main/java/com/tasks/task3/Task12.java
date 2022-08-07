package com.tasks.task3;

/**
 * Задача 50: Программа создает два массива j и g по 10 элементов в каждом.
 * Заполняет массив j случайным образом и выводит его.
 * Потом копирует данные из массива j в массив g и выводит массив g
 */
public class Task12 {

    public static void main(String[] args) {
        int n = 10;
        int[] j = new int[n];
        int[] g = new int[n];

        for (int i = 0; i < n; i++) {
            j[i] = (int)(Math.random() * n + 1);
            System.out.print(j[i]);
            if (i == (n - 1)) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            g[i] = j[i];
            System.out.print(g[i]);
            if (i == (n - 1)) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
        }
    }
}
