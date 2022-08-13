package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 83:
 * Программа проверяет правописание слова “аккумулятор”.
 * Слово вводит пользователь.
 */
public class Task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = "аккумулятор";
        System.out.print("Введите слово 'акамулятор':");
        String word = sc.nextLine();
        sc.close();

        String result;
        if (word.equals(target)) {
            result = "Правильно!";
        } else {
            result = "Не правильно!";
        }
        System.out.println(result);
    }
}
