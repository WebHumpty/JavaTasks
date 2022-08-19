package com.tasks.task5.t21;

public class Car {

    String name;
    int valueFuel;
    double fuelConsumption;

    public void distance(int distances) {
        if (valueFuel / fuelConsumption * 100 < distances) {
            System.out.println(name + " не доедет.");
        } else {
            System.out.println(name + " доедет.");
        }
    }
}
