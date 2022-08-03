package com.tasks;

/**
 * Программа в случайном порядке выдает загрузку мощности от 1 до 100 процентов.
 */
public class Task3 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 100 + 1);

        System.out.println("Загрузка мощности: " + n + "%");
    }
}
