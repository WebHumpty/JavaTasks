package com.tasks.task5.t7;

/**
 * Задача 97:
 * Программа выводит оценки студентов за экзамен
 * и среднюю оценку студентов, оценки формируются случайным образом.
 */
public class StudentApp {

   public static void main(String[] args) {
      int mark1 = (int)(Math.random() * 10) + 1;
      int mark2 = (int)(Math.random() * 10) + 1;
      int mark3 = (int)(Math.random() * 10) + 1;
      double mediumMarks;

      Student ivan = new Student();
      ivan.name = "Иван ";
      ivan.mark = mark1;

      Student masha = new Student();
      masha.name = "Маша ";
      masha.mark = mark2;

      Student petya = new Student();
      petya.name = "Петя ";
      petya.mark = mark3;

      mediumMarks = (double)(ivan.mark + masha.mark + petya.mark) / 3;

      System.out.println(ivan.name + ivan.mark);
      System.out.println(masha.name + masha.mark);
      System.out.println(petya.name + petya.mark);
      System.out.println("Средняя оценка: " + mediumMarks);
   }
}
