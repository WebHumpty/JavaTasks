package com.tasks.task2;

import java.util.Scanner;

/**
 * Задача 23: Ученик сдал экзамен.
 * Внесите с консоли оценку ученику по 10-ти бальной системе.
 * Программа выдаст свою оценку ученику.
 */
public class Task11 {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Введите число:");
       int n = sc.nextInt();
       sc.close();

       switch (n) {
          case 1:
          case 2:
             System.out.println("Отметка: " + n  + " - ужасно");
             break;
          case 3:
          case 4:
             System.out.println("Отметка: " + n + " - плохо");
             break;
          case 5:
          case 6:
             System.out.println("Отметка: " + n + " - удовлетворительно");
             break;
          case 7:
          case 8:
             System.out.println("Отметка: " + n + " - хорошо");
             break;
          case 9:
          case 10:
             System.out.println("Отметка: " + n + " - отлично");
          default:
             System.out.println("Неверная отметка");
       }
   }
}
