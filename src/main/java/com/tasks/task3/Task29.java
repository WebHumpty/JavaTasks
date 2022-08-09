package com.tasks.task3;

/**
 * Задача 67: Программа переводит строковый тип данных
 * в целочисленный и снова переводит в строковый тип данных.
 */
public class Task29 {

    public static void main(String[] args) {
        String[] string = {"Суббота", "5", "Воскресенье", "2"};

        System.out.println(string[0] + " - " + string[1] + ", " + string[2] + " - " + string[3]);

        int a = Integer.parseInt(string[1]);
        a++;
        string[1] = Integer.toString(a);
        int b = Integer.parseInt(string[3]);
        b = b + 5;
        string[3] = Integer.toString(b);

        System.out.println(string[0] + " - " + string[1] + ", " + string[2] + " - " + string[3]);
    }
}
