package com.tasks.task3;

/**
 * Задача 59: Программа здоровается с каждым
 * членом семьи по отдельности и со всеми вместе.
 */
public class Task21 {

    public static void main(String[] args) {
        String[] names = {"папа", "мама", "сын", "дочь"};

        for (String s : names) {
            System.out.println("Здравствуй " + s);
        }
        System.out.println("Всем привет!");
    }
}
