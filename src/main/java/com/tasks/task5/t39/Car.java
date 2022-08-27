package com.tasks.task5.t39;

public class Car {

    String name;
    int maxSpeed;
    static int speedInCity = 60;

    public void distanceOhHighway(int hour) {
        System.out.println("расстояние " + (maxSpeed * hour) + " км.");
    }

    static public void distanceInCity(int hour) {
        System.out.println("расстояние " + (speedInCity * hour) + " км.");
    }
}
