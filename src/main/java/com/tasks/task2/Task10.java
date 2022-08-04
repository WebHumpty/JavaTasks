package com.tasks.task2;

/**
 * Задача 22: Программа выдает в случайном порядке сезоны года
 */
public class Task10 {

    public static void main(String[] args) {
        int period = (int)(Math.random() * 4);

        switch (period) {
            case 0:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Весна");
                break;
            case 2:
                System.out.println("Лето");
                break;
            case 3:
                System.out.println("Осень");
                break;
        }
    }
}
