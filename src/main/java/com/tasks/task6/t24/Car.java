package com.tasks.task6.t24;

public class Car {

    private String name;
    private int speed;
    private int cost;
    private int fuelConsumption;
    private String color;

    public Car(String name, int speed, int cost, int fuelConsumption, String color) {
        this.name = name;
        this.speed = speed;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.color = color;
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
