package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 81:
 * Программа выводит размер строки, введенной пользователем.
 */
public class Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Введите слово:");
        word = sc.nextLine();
        sc.close();

        int l = word.length();
        System.out.println("Длинна строки: " + l);
    }
}
