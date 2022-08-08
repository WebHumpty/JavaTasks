package com.tasks.task3;

/**
 * Задача 62: Программа заполняет массив, как показано ниже:
 *
 * 1 0 0 0 0 0 0 0 0 0
 * 1 1 0 0 0 0 0 0 0 0
 * 1 1 1 0 0 0 0 0 0 0
 * 1 1 1 1 0 0 0 0 0 0
 * 1 1 1 1 1 0 0 0 0 0
 * 1 1 1 1 1 1 0 0 0 0
 * 1 1 1 1 1 1 1 0 0 0
 * 1 1 1 1 1 1 1 1 0 0
 * 1 1 1 1 1 1 1 1 1 0
 * 1 1 1 1 1 1 1 1 1 1
 */
public class Task24 {

    public static void main(String[] args) {
        int n = 10;
        int[][] numbers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = (i < j) ? 0 : 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
