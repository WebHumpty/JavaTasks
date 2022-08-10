package com.tasks.task4;

/**
 * Задача 70: Программа приводит тип данных long
 * в целочисленный тип и строковый тип.
 * Изменяет их, выводит и обратно переводит в данные типа long.
 */
public class Task1 {

    public static void main(String[] args) {
        long l = 214748364;
        long l2 = 3422222;

        System.out.println(l + " " + l2);

        int li = (int)l;
        String l2s = Long.toString(l2);
        System.out.println(li + " " + l2s);

        l = (long)li;
        l2 = Long.parseLong(l2s);
        System.out.println(l + " " + l2);
    }
}
