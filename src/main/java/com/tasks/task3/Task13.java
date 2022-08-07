package com.tasks.task3;

/**
 * Задача 51: Программа выводит оценки учеников
 */
public class Task13 {

    public static void main(String[] args) {
        String[] names = {"Вася", "Петя", "Маша", "Оля", "Коля"};
        int[] grades = {8, 7, 6, 5, 4};

        int l = names.length;
        for (int i = 0; i < l; i++) {
            System.out.println("Имя: " + names[i] + ", оценка: " + grades[i]);
        }
    }
}
