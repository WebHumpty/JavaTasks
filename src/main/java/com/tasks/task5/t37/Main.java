package com.tasks.task5.t37;

/**
 * Задача 127:
 * Программа выводит площадь круга,
 * площадь сектора, длину окружности и длину дуги.
 * Радиус и углы формируются случайным образом.
 */
public class Main {

    public static void main(String[] args) {
        int angleA = (int)(Math.random() * 360) + 1;
        int angleB = (int)(Math.random() * 360) + 1;
        int radius = (int)(Math.random() * 10) + 1;

        System.out.println(Circle.nameOfCircle);
        System.out.println("Радиус " + radius);
        System.out.println("Между углами " + angleA + " и " + angleB);
        System.out.println("Площадь круга " + Circle.areaOfC(radius));
        System.out.println("Площадь сектора " + Circle.areaS(angleA, angleB, radius));
        System.out.println("Длина окружности " + Circle.lengthOfCircle(radius));
        System.out.println("Длина дуги " + Circle.lengthOfArk(angleA, angleB, radius));
    }
}
