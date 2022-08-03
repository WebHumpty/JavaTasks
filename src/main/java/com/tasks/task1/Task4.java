package com.tasks.task1;

/**
 * Задача 3: Программа выдает случайное число от 1 до 10.
 */
public class Task4 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 10 + 1);

        System.out.println("Случайное число: " + n);
    }
}
