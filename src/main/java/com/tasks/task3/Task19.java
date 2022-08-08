package com.tasks.task3;

/**
 * Задача 57: Программа выводит количество 5-рок в массиве.
 */
public class Task19 {

    public static void main(String[] args) {
        int[] a = {8, 7, 10, 5, 4, 9, 2};
        int num = 0;

        for (int v : a) {
            if (v == 5) {
                num += 1;
            }
        }
        System.out.println(num);
    }
}
