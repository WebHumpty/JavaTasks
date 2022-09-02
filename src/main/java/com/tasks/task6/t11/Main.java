package com.tasks.task6.t11;

/**
 * Задача 140:
 * Программа выводит фамилию, имя
 * и паспортные данные 2-х людей.
 */
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Андрей";
        person1.surname = "Иванов";
        Passport passport1 = new Passport();
        passport1.series = "HK";
        passport1.number = 257890;
        person1.passport = passport1;

        Person person2 = new Person();
        person2.name = "Вася";
        person2.surname = "Петров";
        Passport passport2 = new Passport();
        passport2.series = "BC";
        passport2.number = 654856;
        person2.passport = passport2;

        System.out.println(person1.name + " " + person1.surname + " паспорт серия");
        System.out.println(person1.passport.series + " № " + person1.passport.number);
        System.out.println();

        System.out.println(person2.name + " " + person2.surname + " паспорт серия");
        System.out.println(person2.passport.series + " № " + person2.passport.number);
    }
}
