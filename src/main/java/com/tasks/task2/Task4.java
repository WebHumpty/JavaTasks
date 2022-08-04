package com.tasks.task2;

/**
 * Задача 16: Вася и Петя играют в игру “Камень, ножницы, бумага”.
 * Каждый из них показывает свою фигуру
 * камень-0, ножницы-1, бумага-2
 * Программа определяет, кто из них выиграл.
 */
public class Task4 {

    public static void main(String[] args) {
        int petya = (int)(Math.random() * 3);
        int vasya = (int)(Math.random() * 3);

        if (petya == 0) {
            if (vasya == 0) {
                System.out.println("Ничья");
            } else if (vasya == 1) {
                System.out.println("Петя");
            } else if (vasya == 2) {
                System.out.println("Вася");
            }
        } else if (petya == 1) {
            if (vasya == 0) {
                System.out.println("Вася");
            } else if (vasya == 1) {
                System.out.println("Ничья");
            } else if (vasya == 2) {
                System.out.println("Петя");
            }
        } else if (petya == 2) {
            if (vasya == 0) {
                System.out.println("Петя");
            } else if (vasya == 1) {
                System.out.println("Вася");
            } else if (vasya == 2) {
                System.out.println("Ничья");
            }
        }
    }
}
