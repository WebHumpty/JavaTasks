package com.tasks.task5.t11;

import java.util.Scanner;

/**
 * Задача 101:
 * Пользователь вводит размеры коробки,
 * программа выводит объем коробки и длину всех сторон коробки.
 */
public class BoxApp {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Box box = new Box();
       System.out.println("Введите стороны коробки");
       System.out.print("Введите число:");
       box.width = sc.nextInt();
       System.out.print("Введите число:");
       box.height = sc.nextInt();
       System.out.print("Введите число:");
       box.length = sc.nextInt();

       box.valueOfBox();
       box.lengthOfSides();
   }
}
