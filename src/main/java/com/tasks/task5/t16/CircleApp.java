package com.tasks.task5.t16;

/**
 * Задача 106:
 * Программа выводит площадь круга
 * и длину окружности по радиусу окружности,
 * радиус задается случайным образом.
 */
public class CircleApp {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = (int)(Math.random() * 100 + 1);

        System.out.println("Круг: " + circle.color);
        System.out.println("Радиус: " + circle.radius);
        System.out.println("Площадь: " + circle.areaOfCircle());
        System.out.println("Окружность: " + circle.lengthOfCircle());
    }
}
