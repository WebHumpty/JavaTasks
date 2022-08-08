package com.tasks.task3;

import java.util.Scanner;

/**
 * Задача 55: Пользователь вводит три слова.
 * Программа записывает их в массив и выводит в одну строчку.
 */
public class Task17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String world;
        int n = 3;
        String[] out = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово:");
            world = sc.nextLine();
            out[i] = world;
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }

    }
}
