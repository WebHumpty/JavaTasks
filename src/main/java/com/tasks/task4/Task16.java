package com.tasks.task4;

/**
 * Задача 85:
 * Программа приводит все типы переменных
 * к переменным типа String.
 */
public class Task16 {

    public static void main(String[] args) {
        int a = 4;
        double b = 1.45;
        long c = 1000000000;
        char d = 'f';
        boolean e = true;

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        String s4 = String.valueOf(d);
        String s5 = String.valueOf(e);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
