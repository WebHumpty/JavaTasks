package com.tasks.task2;

/**
 * Задача 31: Программа выводит сезон года в зависимости от номера месяца.
 * Месяц выбирается случайным образом.
 */
public class Task19 {

    public static void main(String[] args) {
        int month = (int)(Math.random() * 12 + 1);
        String season = "";

        if (month == 12 || month == 1 || month == 2) {
            season = "Зима";
        } else if (month >= 3 && month <= 5) {
            season = "Весна";
        } else if (month >= 6 && month <= 8) {
            season = "Лето";
        } else if (month >= 9 && month <= 11) {
            season = "Осень";
        }
        System.out.println("Номер: " + month + ", сезон: " + season);
    }
}
