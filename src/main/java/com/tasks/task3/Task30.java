package com.tasks.task3;

/**
 * Задача 68:
 * Программа приводит дробный тип данных в строковый тип данных,
 * целочисленный тип и укороченный дробный тип,
 * а потом обратно приводит в дробный тип данных.
 */
public class Task30 {

    public static void main(String[] args) {
        double a = 1.55;
        double b = 1.77;
        double c = 1.88;
        double d = 1.12345678901;

        System.out.println(a + " " + b + " " + c + " " + d);

        int ai = (int)a;
        String bs = b + "";
        String cs = Double.toString(c);
        float df = (float)d;

        System.out.println(ai + " " + bs + " " + cs + " " + df);

        a = (double)ai;
        b = Double.valueOf(bs);
        c = Double.valueOf(cs);
        d = (double)df;

        System.out.println(a + " " + b + " " + c + " " + d);

    }
}
