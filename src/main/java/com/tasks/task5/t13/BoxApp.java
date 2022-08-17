package com.tasks.task5.t13;

/**
 * Задача 103:
 * Пользователь вводит размеры коробки,
 * программа выводит размеры, объем коробки и длину всех сторон коробки.
 */
public class BoxApp {

    public static void main(String[] args) {
        Box box = new Box();
        box.inputSides();
        box.valueOfBox();
        box.lengthOfSides();
    }
}
