package com.tasks.task5.t26;

/**
 * Задача 116:
 * Программа выводит два билета для Паши и Димы до города Минск,
 * стоимость билета зависит от наличия льготы.
 */
public class TicketApp {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Иван";
        person1.surname = "Попов";
        person1.age = 19;
        person1.student = true;

        Person person2 = new Person();
        person2.name = "Маша";
        person2.surname = "Иванова";
        person2.age = 27;
        person2.student = false;

        Person person3 = new Person();
        person3.name = "Дима";
        person3.surname = "Петров";
        person3.age = 18;
        person3.student = true;

        String town = "Минск";
        int cost = 1500;

        person1.getTicket(town, cost);
        person2.getTicket(town, cost);
        person3.getTicket(town, cost);

    }
}
