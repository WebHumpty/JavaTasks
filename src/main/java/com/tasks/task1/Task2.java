package com.tasks.task1;

/**
 * Задача 1: Программа выдает случайное число от 0 до 9
 */
public class Task2 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 10);

        System.out.println("Случайное число: " + n);
    }
}
