package com.tasks.task2;

/**
 * Задача 18: Программа в случайном порядке выдает сезоны года
 */
public class Task6 {

    public static void main(String[] args) {
        int period = (int)(Math.random() * 4);

        if (period == 0) {
            System.out.println("Зима");
        } else if (period == 1) {
            System.out.println("Весна");
        } else if (period == 2) {
            System.out.println("Лето");
        } else if (period == 3) {
            System.out.println("Осень");
        }
    }
}
