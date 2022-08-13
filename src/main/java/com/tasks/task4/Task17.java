package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 86:
 * Программа проверяет: ввел что-либо пользователь или нет.
 */
public class Task17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Введите слово:");
        word = sc.nextLine();
        sc.close();

        if (word.isEmpty()) {
            System.out.println("Вы ничего не ввели");
        } else {
            System.out.println("Вы ввели: " + word);
        }
    }
}
