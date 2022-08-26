package com.tasks.task5.t35;

import java.util.Scanner;

/**
 * Задача 125:
 * Пользователь выбирает автора,
 * программа выводит начало стиха этого автора.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите стих:");
        System.out.println("1 - Пушкин");
        System.out.println("2 - Лермонтов");
        System.out.println("3 - Есенин");
        System.out.print("Введите число:");
        int n = sc.nextInt();
        sc.close();
        switch (n) {
            case 1:
                System.out.println(Verse.pushkin);
                break;
            case 2:
                System.out.println(Verse.lermontov);
                break;
            case 3:
                System.out.println(Verse.esenin);
                break;
            default:
                System.out.println(Verse.whatElse);
                break;
        }
    }
}
