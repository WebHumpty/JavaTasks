package com.tasks.task6.t2;

public class Square {

    public static void degree(int a) {
        System.out.println("Квадрат числа 5: " + (a * a));
    }

    public static void degree(String a) {
        int b = Integer.parseInt(a);
        System.out.println("Квадрат числа 5: " + (b * b));
    }

    public static void degree(long a) {
        int b = (int)a;
        System.out.println("Квадрат числа 5: " + (b * b));
    }

    public static void degree(short a) {
        int b = (int)a;
        System.out.println("Квадрат числа 5: " + (b * b));
    }

    public static void degree(char a) {
        int b = a - 48;
        System.out.println("Квадрат числа 5: " + (b * b));
    }
}
