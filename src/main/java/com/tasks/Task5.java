package com.tasks;

/**
 * Задача 4: Программа выдает случайную дату января.
 */
public class Task5 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 31 + 1);

        System.out.println(n + " января.");
    }
}
