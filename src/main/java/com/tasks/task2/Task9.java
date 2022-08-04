package com.tasks.task2;

/**
 * Задача 21: Программа в случайном порядке выдает дни недели.
 */
public class Task9 {

    public static void main(String[] args) {
        int day = (int)(Math.random() * 7);

        switch (day) {
            case 0:
                System.out.println("Понедельник");
                break;
            case 1:
                System.out.println("Вторник");
                break;
            case 2:
                System.out.println("Среда");
                break;
            case 3:
                System.out.println("Четверг");
                break;
            case 4:
                System.out.println("Пятница");
                break;
            case 5:
                System.out.println("Суббота");
                break;
            case 6:
                System.out.println("Воскресенье");
                break;
        }
    }
}
