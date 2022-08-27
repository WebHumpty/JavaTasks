package com.tasks.task5.t38;

public class Car {

    String name;
    int maxSpeed;
    static int speedInCity = 60;

    public void distanceOnHighway(int hour) {
        System.out.println("расстояние " + (maxSpeed * hour) + " км.");
    }

    static public void distanceInCity(int hour) {
        System.out.println("расстояние " + (speedInCity * hour) + " км.");
    }
}
