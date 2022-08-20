package com.tasks.task5.t22;

public class Car {

    String name;
    int valueFuel;
    double fuelConsumption;

    public void distance(int distance) {
        if (valueFuel / fuelConsumption * 100 < distance) {
            System.out.println(name + " не доедет.");
        } else {
            System.out.println(name + " доедет.");
        }
    }
}
