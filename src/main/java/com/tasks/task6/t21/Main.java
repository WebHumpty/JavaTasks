package com.tasks.task6.t21;

/**
 * Задача 150:
 * Программа выводит характеристики трех одинаковых автомобилей, поступивших в салон.
 * Если характеристики не заданы, int переменным присваивается 0,
 * String переменным присваивается null.
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.outCar();
        car2.outCar();
        car3.outCar();
    }
}
