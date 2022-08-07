package com.tasks.task3;

/**
 * Задача 41: Программа суммирует числа от 1 до 10
 */
public class Task2 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
