package com.tasks.task5.t21;

import java.util.Scanner;

/**
 * Задача 111:
 * Пользователь вводит расстояние между городами,
 * программа определяет доедут ли машины из одного города в другой,
 * если у них полный бак топлива, и выводит сообщение.
 */
public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "BMV";
        car1.valueFuel = 60;
        car1.fuelConsumption = 9.7;

        Car car2 = new Car();
        car2.name = "Hummer";
        car2.valueFuel = 120;
        car2.fuelConsumption = 27;

        Car car3 = new Car();
        car3.name = "Toyota";
        car3.valueFuel = 50;
        car3.fuelConsumption = 5.7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние мужду городами");
        System.out.print("Введите число:");
        int distance = sc.nextInt();
        sc.close();

        car1.distance(distance);
        car2.distance(distance);
        car3.distance(distance);
    }
}
