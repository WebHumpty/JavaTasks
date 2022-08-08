package com.tasks.task3;

/**
 * Задача 54: Программа генерирует случайные фразы из массивов строк
 */
public class Task16 {

    public static void main(String[] args) {
        String[] s1 = {"Маша", "Даша", "Паша", "Оля", "Коля"};
        String[] s2 = {" смотрит", " учит", " читает", " мучит", " пишет"};
        String[] s3 = {" урок.", " тест.", " текст.", " задание.", " д/з."};

        int n1 = (int)(Math.random() * 5);
        int n2 = (int)(Math.random() * 5);
        int n3 = (int)(Math.random() * 5);

        String out = s1[n1] + s2[n2] + s3[n3];
        System.out.println(out);
    }
}
