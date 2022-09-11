package com.tasks.task6.t26;

public class Car {

    private String name;
    private int speed;
    private int cost;
    private int fuelConsumption;
    private String color;

    public Car(String name, int speed, int cost, int fuelConsumption, String color) {
        name = name;
        speed = speed;
        cost = cost;
        fuelConsumption = fuelConsumption;
        color = color;
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
