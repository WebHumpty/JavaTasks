package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 84:
 * Пользователь вводит три слова,
 * программа сортирует их в алфавитном порядке.
 */
public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[3];
        System.out.print("Введите слово:");
        strings[0] = sc.nextLine();
        System.out.print("Введите слово:");
        strings[1] = sc.nextLine();
        System.out.print("Введите слово:");
        strings[2] = sc.nextLine();
        sc.close();

        for (int i = 0; i < strings.length; i++) {
            for (int j = (i + 1); j < strings.length; j++) {
                if (strings[j].compareTo(strings[i]) < 0) {
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
            System.out.println(strings[i]);
        }
    }
}
