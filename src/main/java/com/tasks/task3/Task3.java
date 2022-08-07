package com.tasks.task3;

import java.util.Scanner;

/**
 * Задача 42: Машина загадывает число от 1 до 10.
 * Пользователь пытается угадать число до трех попыток.
 * Машина подсказывает пользователю загаданное
 * число больше или меньше числа, введенного пользователем.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int)(Math.random() * 10 + 1);
        System.out.println("Угадай число от 1 до 10");
        int i = 1, n;
        do {
            System.out.print("Введите число:");
            n = sc.nextInt();
            if (i == 3) {
                System.out.println("Число попыток закончилось, загаданное число: " + x);
                break;
            }
            i++;
        } while (x != n);
        System.out.println("Вы угадали, загаданное число: " + x + ", ваше число: " + n);
    }
}
