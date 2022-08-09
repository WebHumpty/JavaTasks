package com.tasks.task3;

/**
 * Задача 64: Программа заполняет массив числами по порядку и выводит его.
 */
public class Task26 {

    public static void main(String[] args) {
        int n = 5;
        String[][] fields = new String[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                fields[i][j] = " " + num;
                System.out.print(fields[i][j]);
                num++;
            }
            System.out.println();
        }
    }
}
