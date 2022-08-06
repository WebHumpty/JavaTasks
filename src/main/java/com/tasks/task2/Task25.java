package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 37: Машина загадывает число от 1 до 10.
 * Пользователь пытается угадать число.
 * Пользователь повторяет попытки пока не угадает.
 */
public class Task25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int result = (int)(Math.random() * 10 + 1);

        System.out.println("Угадай число от 1 до 10");
        do {
            System.out.print("Введите число:");
            x = sc.nextInt();
        } while (result != x);
        System.out.println("Загаданное число: " + result + ", ваше число: " + x);
        sc.close();
    }
}
