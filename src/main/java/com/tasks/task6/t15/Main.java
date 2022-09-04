package com.tasks.task6.t15;

/**
 * Задача 144:
 * Программа имитирует работу валидатора в метро:
 * пропускает, если проезд оплачен, и не пропускает, если проезд не оплачен.
 * После каждого прохода через валидатор с билета списывается 1 поездка.
 */
public class Main {

    public static void main(String[] args) {
        Valid validator = new Valid();
        validator.location = "Станция метро 'Круговая'";
        validator.name = "Валидатор №1";

        Ticket ticket1 = new Ticket();
        ticket1.count = 2;
        validator.open(ticket1);

        Ticket ticket2 = new Ticket();
        ticket2.count = 10;
        validator.open(ticket2);

        validator.open(ticket1);

        validator.open(ticket1);
    }
}
