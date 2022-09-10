package com.tasks.task6.t25;

/**
 * Задача 154:
 * Программа выводит характеристики трех разных автомобилей,
 * поступивших в салон.Информация об автомобиле инициализируется в конструкторе.
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("BMW-5", 240, 1100000, 9, "Черный");
        Car car2 = new Car("BMW-3", 180, 9500000, 7, "Красный");
        Car car3 = new Car("BMW-6", 243, 1400000, 11, "Черный");

        car1.outCar();
        car2.outCar();
        car3.outCar();
    }
}
