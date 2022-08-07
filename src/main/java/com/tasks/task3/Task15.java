package com.tasks.task3;

/**
 * Задача 53: Программа генерирует случайные фразы из массивов строк
 */
public class Task15 {

    public static void main(String[] args) {
        String[] s1 = {"Мир", "Наука", "Торговля", "Мысль", "Коля"};
        String[] s2 = {" бежит", " движет", " обгоняет", " несет", " ведет"};
        String[] s3 = {" быстро.", " умно.", " рьяно.", " мудро.", " круто."};

        int l = s1.length;
        int n1 = (int)(Math.random() * l);
        int n2 = (int)(Math.random() * l);
        int n3 = (int)(Math.random() * l);

        String out = s1[n1] + s2[n2] + s3[n3] + ".";
        System.out.println(out);
    }
}
