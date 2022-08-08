package com.tasks.task3;

/**
 * Задача 60: Программа здоровается с каждым членом семьи,
 * а потом прощается с каждым членом семьи.
 */
public class Task22 {

    public static void main(String[] args) {
        String[] names = {"папа", "мама", "сын", "дочь"};

        for (String s : names) {
            System.out.println("Здравствуй " + s);
        }

        for (String s : names) {
            System.out.println("Пока " + s);
        }
    }
}
