package com.tasks.task5.t2;

/**
 * Задача 92:
 * Программа выводит размеры и цвет коробки.
 */
public class BoxApp {

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Коробка");
        System.out.println("Ширина: " + box.width + " см.");
        System.out.println("Цвет: " + box.color);
    }
}
