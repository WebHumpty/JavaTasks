package com.tasks.task3;

/**
 * Задача 65: Программа выводит двухмерный массив.
 * Массив инициализируется при объявлении.
 */
public class Task27 {

    public static void main(String[] args) {
        String array[][] = {
                {"Зима", "Весна", "Лето", "Осень"},
                {"Папа", "Мама", "Сын", "Дочь"},
                {"Холодно", "Тепло", "Жарко", "Комфортно"}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
