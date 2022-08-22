package com.tasks.task5.t27;

/**
 * Задача 117:
 * Программа выводит два билета для Паши и Димы до города Минск,
 * стоимость билета зависит от наличия льготы.
 */
public class PersonApp {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Паша";
        person1.surname = "Иванов";
        person1.age = 19;
        person1.student = true;

        Person person2 = new Person();
        person2.name = "Дима";
        person2.surname = "Петров";
        person2.age = 27;
        person2.student = false;

        String town = "Минск";
        int cost = 1500;

        person1.getTicket(town, cost);
        person2.getTicket(town, cost);
    }
}
