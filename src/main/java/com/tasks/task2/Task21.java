package com.tasks.task2;

/**
 * Задача 33: Вася и Петя играют в игру “Камень, ножницы, бумага”.
 * Каждый из них показывает свою фигуру
 * камень-0, ножницы-1, бумага-2.
 * Программа определяет, кто из них выиграл.
 * Выбор каждого участника формируется случайным образом.
 */
public class Task21 {

   public static void main(String[] args) {
       int petya = (int)(Math.random() * 3);
       int vasya = (int)(Math.random() * 3);
       String result;

       if (petya == 0 && vasya == 0 || petya == 1 && vasya == 1 || petya == 2 && vasya == 2) {
           result = "Ничья";
       } else if (petya == 0 && vasya == 1 || petya == 1 && vasya == 2 || petya == 2 && vasya == 0) {
           result = "Петя";
       } else {
           result = "Вася";
       }

       System.out.println(petya + " = " + vasya + " = " + result);
   }
}
