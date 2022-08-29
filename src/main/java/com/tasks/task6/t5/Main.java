package com.tasks.task6.t5;

/**
 * Задача 134:
 * Программа выводит адреса Андрея,
 * Пети и Васи, в каждом адресе разное количество реквизитов.
 */
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Андрей";
        person1.town = "Минск";
        person1.street = "Есенина";
        person1.house = 68;
        person1.corps = 3;
        person1.flat = 3;

        Person person2 = new Person();
        person2.name = "Петя";
        person2.town = "Пенза";
        person2.street = "Ленина";
        person2.house = 22;
        person2.flat = 8;

        Person person3 = new Person();
        person3.name = "Вася";
        person3.town = "Тверь";
        person3.street = "Пушкина";
        person3.house = 111;

        System.out.println(person1.name);
        person1.address(person1.town, person1.street, person1.house, person1.corps, person1.flat);
        System.out.println();
        System.out.println(person2.name);
        person2.address(person2.town, person2.street, person2.house, person2.flat);
        System.out.println();
        System.out.println(person3.name);
        person3.address(person3.town, person3.street, person3.house);
    }
}
