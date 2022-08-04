package com.tasks.task2;

/**
 * Задача 17: Программа в случайном порядке выдает дни недели.
 */
public class Task5 {

    public static void main(String[] args) {
        int day = (int)(Math.random() * 7);

        if (day == 0) {
            System.out.println("Понедельник");
        } else if (day == 1) {
            System.out.println("Вторник");
        } else if (day == 2) {
            System.out.println("Среда");
        } else if (day == 3) {
            System.out.println("Четверг");
        } else if (day == 4) {
            System.out.println("Пятница");
        } else if (day == 5) {
            System.out.println("Суббота");
        } else if (day == 6) {
            System.out.println("Воскресенье");
        }
    }
}
