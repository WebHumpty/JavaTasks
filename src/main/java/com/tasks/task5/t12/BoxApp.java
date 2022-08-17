package com.tasks.task5.t12;

import java.util.Scanner;

/**
 * Задача 102:
 * Пользователь вводит размеры коробки,
 * программа выводит объем коробки и длину всех сторон коробки.
 */
public class BoxApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();

        System.out.println("Введите стороны коробки");
        System.out.print("Введите ширину:");
        box.width = sc.nextInt();
        System.out.print("Введите высоту:");
        box.height = sc.nextInt();
        System.out.print("Введите длинну:");
        box.length = sc.nextInt();
        sc.close();

        box.valueOfBox();
        box.lengthOfSides();
    }
}
