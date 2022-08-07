package com.tasks.task3;

/**
 * Задача 52: Программа формирует строку из массива
 */
public class Task14 {

    public static void main(String[] args) {
        String[] worlds = {"Вася", "дома", "Маша", "в школе", "Коля", "дома", "Ваня", "в школе"};
        String out = "";
        int l = worlds.length;

        for (int i = 0; i < l; i = i + 2) {
            out = out + worlds[i] + " " + worlds[i + 1] + ".\n";
        }
        System.out.println(out);
    }
}
