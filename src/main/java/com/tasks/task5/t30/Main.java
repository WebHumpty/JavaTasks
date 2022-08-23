package com.tasks.task5.t30;

/**
 * Задача 120:
 * Программа выводит объем шара сектора шара и сегмента шара,
 * радиус и высота сегмента формируются случайным образом.
 */
public class Main {

    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.color = "Красная";

        int rad = (int)(Math.random() * 10) + 1;
        int h = (int)(Math.random() * rad * 2) + 1;

        System.out.println(sphere.color + " сфера");
        System.out.println("Радиус " + rad);
        System.out.println("Высота сегмента " + h);
        System.out.println("Объем шара=" + sphere.valueSphere(rad));
        System.out.println("Объем сектора шара=" + sphere.valueSector(h, rad));
        System.out.println("Объем сегмента шара=" + sphere.valueSegment(h, rad));
    }
}
