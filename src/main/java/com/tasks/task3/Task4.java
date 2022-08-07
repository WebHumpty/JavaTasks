package com.tasks.task3;

import java.util.Scanner;

/**
 * Задача 42: Машина загадывает число от 1 до 10.
 * Пользователь пытается угадать число до трех попыток.
 * Машина подсказывает пользователю загаданное число больше
 * или меньше числа, введенного пользователем.
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i;
        int result = (int)(Math.random() * 10 + 1);

        System.out.println("Угадай число.");
        for (i = 0; i < 3; i++) {
            System.out.print("Введите число:");
            a = sc.nextInt();
            if (a == result) {
                System.out.println("Вы угадали, загаданное число: " + result + ", ваше: " + a);
                break;
            } else {
                if (result < a) {
                    System.out.println("Число меньше вашего числа.");
                } else {
                    System.out.println("Число больше вашего числа.");
                }
            }
        }

        sc.close();

        if (i == 3) {
            System.out.println("Закончилось число попыток, загаданное число: " + result);
        }
    }
}
