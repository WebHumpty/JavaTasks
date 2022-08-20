package com.tasks.task5.t23;

import java.util.Scanner;

/**
 * Задача 113:
 * Расстояние от деревни до станции 10 км.
 * Три пешехода выходят из деревни, чтобы сесть на поезд.
 * Поезд отъезжает через 2 часа.
 * Пользователь вводит скорость ходьбы пешеходов,
 * программа определяет, успеют ли пешеходы на поезд,
 * и выводит сообщение.
 */
public class PersonApp {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Иван";
        person1.age = 19;
        person1.weight = 60;

        Person person2 = new Person();
        person2.name = "Ден Иван";
        person2.age = 20;
        person2.weight = 60;

        Person person3 = new Person();
        person3.name = "Вася";
        person3.age = 20;
        person3.weight = 110;

        Scanner sc = new Scanner(System.in);
        String s = "Введите скорость ходьбы пешехода";

        System.out.println(s);
        System.out.println(person1.name + ", " + person1.age + "лет, вес " + person1.weight + " кг.");
        System.out.print("Введите число:");
        int speed1 = sc.nextInt();

        System.out.println(s);
        System.out.println(person2.name + ", " + person2.age + " лет, вес " + person2.weight + " кг.");
        System.out.print("Введите число:");
        int speed2 = sc.nextInt();

        System.out.println(s);
        System.out.println(person3.name + ", " + person3.age + " лет, вес " + person3.weight + " кг.");
        System.out.print("Введите число:");
        int speed3 = sc.nextInt();
        sc.close();

        person1.reach(speed1);
        person2.reach(speed2);
        person3.reach(speed3);
    }
}
