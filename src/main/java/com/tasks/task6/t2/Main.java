package com.tasks.task6.t2;

/**
 * Задача 131:
 * Программа выводит квадрат числа 5
 * вне зависимости от типов входящих данных.
 */
public class Main {

    public static void main(String[] args) {
        int ai = 5;
        String as = "5";
        long al = 5;
        short ash = 5;
        char ac = '5';

        Square.degree(ai);
        Square.degree(as);
        Square.degree(al);
        Square.degree(ash);
        Square.degree(ac);
    }
}
