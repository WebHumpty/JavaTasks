package com.tasks.task3;

/**
 * Задача 56: Программа выводит два массива.
 */
public class Task18 {

    public static void main(String[] args) {
        String[] names = {"Вася", "Петя", "Маша", "Оля", "Коля"};
        int[] grades = {8, 7, 10, 5, 4};

        for (String v : names) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : grades) {
            System.out.print(v + " ");
        }
    }
}
