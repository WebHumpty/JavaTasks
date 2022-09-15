package com.tasks.task6.t30;

/**
 * Задача 159:
 * Программа выводит адреса трех людей,
 * адреса записаны с разными реквизитами.
 */
public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Андрей", "Москва", "Есенина", 68, 3, 10);
        Address address2 = new Address("Петя", "Пенза", "Ленина", 22, 8);
        Address address3 = new Address("Вася", "Тверь", "Пушкина", 111);

        address1.display();
        address2.display();
        address3.display();
    }
}
