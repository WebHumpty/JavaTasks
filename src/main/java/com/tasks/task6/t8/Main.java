package com.tasks.task6.t8;

/**
 * Задача 137:
 * Программа выводит имя, фамилию и адрес человека.
 */
public class Main {

    public static void main(String[] args) {
        People people1 = new People();
        people1.name = "Андрей";
        people1.surname = "Иваной";
        Address address1 = new Address();
        address1.town = "Тверь";
        address1.street = "Ленина";
        address1.house = 5;
        address1.flat = 2;
        people1.address = address1;

        People people2 = new People();
        people2.name = "Вася";
        people2.surname = "Петров";
        Address address2 = new Address();
        address2.town = "Сочи";
        address2.street = "Советская";
        address2.house = 8;
        address2.flat = 22;
        people2.address = address2;

        System.out.println(people1.name + " " + people1.surname + " живет в городе: ");
        System.out.println(people1.address.town + ", на улице " + people1.address.street + ", ");
        System.out.println("дом " + people1.address.house + ", квартира " + people1.address.flat);
        System.out.println();

        System.out.println(people2.name + " " + people2.surname + " живет в городе: ");
        System.out.println(people2.address.town + ", на улице " + people2.address.street + ", ");
        System.out.println("дом " + people2.address.house + ", квартира " + people2.address.flat);
    }
}
