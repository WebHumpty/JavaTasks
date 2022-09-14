package com.tasks.task6.t29;

/**
 * Задача 158:
 * Программа выводит варианты поездки и общую стоимость поездки.
 * В поездке можно отказаться от завтрака и экскурсий.
 */
public class Main {

    public static void main(String[] args) {
        Trip trip1 = new Trip(1500, 2200, 450, 400, 350, 0);
        Trip trip2 = new Trip(1500, 2200, 450, 400, 0);
        Trip trip3 = new Trip(1500, 2200, 450, 100);
        Trip trip4 = new Trip(1500, 2200, 200);

        trip1.costOfTrip();
        trip2.costOfTrip();
        trip3.costOfTrip();
        trip4.costOfTrip();
    }
}
