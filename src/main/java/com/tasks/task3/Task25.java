package com.tasks.task3;

/**
 * Задача 63: Программа заполняет массив, как показано ниже:
 * 0 1 1 1 1 1 1 1 1 1
 * 0 0 1 1 1 1 1 1 1 1
 * 0 0 0 1 1 1 1 1 1 1
 * 0 0 0 0 1 1 1 1 1 1
 * 0 0 0 0 0 1 1 1 1 1
 * 0 0 0 0 0 0 1 1 1 1
 * 0 0 0 0 0 0 0 1 1 1
 * 0 0 0 0 0 0 0 0 1 1
 * 0 0 0 0 0 0 0 0 0 1
 * 0 0 0 0 0 0 0 0 0 0
 */
public class Task25 {

    public static void main(String[] args) {
        int n = 10;
        int[][] multiplication = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                multiplication[i][j] = (i >= j) ? 0 : 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println();
        }
    }
}
