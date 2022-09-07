package com.tasks.task6.t21;

public class Car {

    String name;
    int speed;
    int cost;
    double fuelConsumption;
    String color;

    public Car() {
        this.fuelConsumption = 9.7;
        this.name = "BMW";
        this.speed = 220;
    }

    public void outCar() {
        System.out.println("Марка: " + name);
        System.out.println("Скорость: " + speed);
        System.out.println("Цена: " + cost);
        System.out.println("Расход: " + fuelConsumption);
        System.out.println("Цвет: " + color);
        System.out.println();
    }
}
