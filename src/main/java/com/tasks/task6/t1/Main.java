package com.tasks.task6.t1;

import java.util.Scanner;

/**
 * Задача 130:
 * Пользователь вводит число,
 * программа выводит надписи такое количество раз,
 * сколько ввел пользователь.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = sc.nextInt();

        DisplayNumber.display(n);
    }
}
