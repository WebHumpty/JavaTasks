package com.tasks.task2;

/**
 * Задача 29: Программа случайным образом выводит
 * порядковый номер дня недели и сообщает рабочий этот день или выходной.
 */
public class Task17 {

    public static void main(String[] args) {
        int dayNumber = (int)(Math.random() * 7);
        String day = dayNumber < 6 ? "рабочий день." : "выходной день.";
        System.out.println("Число " + dayNumber);
        System.out.println("Сегодня " + day);
    }
}
