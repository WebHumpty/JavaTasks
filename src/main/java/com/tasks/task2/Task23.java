package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 35: Программа определяет большее из двух чисел,
 * введенных пользователем, или выдает сообщение, что числа равны.
 */
public class Task23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();

        if (a != b) {
            if (a > b) {
                System.out.println(a + " больше " + b);
            } else {
                System.out.println(a + " меньше " + b);
            }
        } else {
            System.out.println("Числа равны");
        }
    }
}
