package com.tasks.task1;

/**
 * Задача 5: Программа в случайном порядке выдает загрузку мощности от 0 до 100 процентов.
 */
public class Task6 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 101);

        System.out.println("Загрузка мощности: " + n + "%");
    }
}
