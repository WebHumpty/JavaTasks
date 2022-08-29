package com.tasks.task6.t6;

/**
 * Задача 135:
 * Программа выводит площади кругов
 * красного и желтого цветов с радиусами 5 см.
 * Входящие типы данных String и int.
 */
public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.color = "Красный";
        Circle circle2 = new Circle();
        circle2.color = "Желтый";

        int radiusInt = 5;
        String radiusString = "5";

        System.out.println(circle1.color + " круг прощадью " + circle1.areaOfCircle(radiusInt) + " см. кв.");
        System.out.println(circle1.color + " круг площадью " + circle1.areaOfCircle(radiusString) + " смю кв.");

        System.out.println(circle2.color + " круг площадью " + circle2.areaOfCircle(radiusInt) + " см. кв.");
        System.out.println(circle2.color + " круг площадью " + circle2.areaOfCircle(radiusString) + " см. кв.");
    }
}
