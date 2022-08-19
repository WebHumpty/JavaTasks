package com.tasks.task5.t20;

/**
 * Задача 110:
 * Программа выводит высоту и основание треугольника,
 * затем вычисляет площадь и тоже выводит её.
 */
public class TriangleApp {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.base = (int)(Math.random() * 100 + 1);
        triangle1.height = (int)(Math.random() * 100 + 1);

        Triangle triangle2 = new Triangle();
        triangle2.base = (int)(Math.random() * 100 + 1);
        triangle2.height = (int)(Math.random() * 100 + 1);

        System.out.println(triangle1.triangle());
        System.out.println("Площадь " + triangle1.areaOfTriangle());

        System.out.println(triangle2.triangle());
        System.out.println("Площадь " + triangle2.areaOfTriangle());
    }
}
