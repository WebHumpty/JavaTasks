package com.tasks.task5.t34;

/**
 * Задача 124:
 * Программа вычисляет и выводит разницы
 * температур кипения и замерзания веществ.
 */
public class Main {

    public static void main(String[] args) {
        String str = "разница между точкой кипеня и замерзания состовляет ";
        String g = " градусов ";
        System.out.println("Вода:");
        System.out.println(str + (Temperature.boilOfWater - Temperature.freezOfWater + g));
        System.out.println("Кислород:");
        System.out.println(str + (Temperature.boilOfOxygen - Temperature.freezOfOxygen + g));
        System.out.println("Водород:");
        System.out.println(str + (Temperature.boilOfHydrog - Temperature.freezOfHydrog + g));
    }
}
