package com.tasks.task5.t31;

/**
 * Задача 121:
 * Программа выводит сообщение об скорости света
 * и ускорении свободного падения.
 */
public class Main {

    public static void main(String[] args) {
        String strSpeedOfLights = "Свет преодолевает расстояние от Солнца до Земли за ";
        String straOfGravity = "ускорение свободного падения = ";
        long timeFromEarthToSun;
        timeFromEarthToSun = Speed.distanceFromEarthToSun / Speed.speedOfLights;
        System.out.println(strSpeedOfLights + timeFromEarthToSun + " сек.");
        System.out.println(straOfGravity + Speed.aOfGravity + " м/сек^2");
    }
}
