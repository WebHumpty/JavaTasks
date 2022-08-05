package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 25: Пользователь вводит число от 1 до 5.
 * Программа выдает это число прописью либо сообщает,
 * что пользователь ввел неверное число.
 */
public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5:");
        int n = sc.nextInt();
        sc.close();

        switch (n) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            default:
                System.out.println("Число должно быть от 1 до 5");
        }
    }
}
