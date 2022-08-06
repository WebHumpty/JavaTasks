package com.tasks.task2;

/**
 * Задача 36: Программа суммирует числа от 1 до 10.
 */
public class Task24 {

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i != 11);
        System.out.println(sum);
    }
}
