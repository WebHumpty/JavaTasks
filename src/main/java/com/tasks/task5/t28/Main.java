package com.tasks.task5.t28;

/**
 * Задача 118:
 * Программа выводит площадь сектора
 * и длину дуги кругов от угла а до угла b,
 * углы формируются случайным образом.
 */
public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.color = "Красный";
        circle1.radius = 10;

        Circle circle2 = new Circle();
        circle2.color = "Синий";
        circle2.radius = 5;

        int angleA = (int)(Math.random() * 360) + 1;
        int angleB = (int)(Math.random() * 360) + 1;

        System.out.println(circle1.color + " круг");
        System.out.println("Радиус " + circle1.radius);
        System.out.println("Между углами " + angleA + " и " + angleB);
        System.out.println("Площадь скетора=" + circle1.areaS(angleA, angleB));
        System.out.println("Длинна дуги=" + circle1.lengthOfArk(angleA, angleB));
        System.out.println("----------------------------");

        System.out.println(circle2.color + " круг");
        System.out.println("Радиус " + circle2.radius);
        System.out.println("Между углами " + angleA + " и " + angleB);
        System.out.println("Площадь сектора=" + circle2.areaS(angleA, angleB));
        System.out.println("Длинна дуги=" + circle2.lengthOfArk(angleA, angleB));
        System.out.println("----------------------------");
    }
}
