package com.tasks.task3;

/**
 * Задача 40: Программа выводит цифры от 1 до 10,
 * а потом, начиная с другой строчки, от 10 до 1.
 */
public class Task1 {

    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            System.out.print(i + " ");
        } while (i < 10);
        System.out.println();
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);
    }
}
