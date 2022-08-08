package com.tasks.task3;

/**
 * Задача 61: Программа заполняет двухмерный массив
 * таблицей умножения и выводит таблицу умножения.
 */
public class Task23 {

    public static void main(String[] args) {
        int n = 10;
        int multiplication[][] = new int[n][n];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                multiplication[i][j] = (i * j);
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }
    }
}
