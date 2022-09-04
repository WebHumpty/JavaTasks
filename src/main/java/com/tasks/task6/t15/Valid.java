package com.tasks.task6.t15;

public class Valid {

    String name;
    String location;

    public void open(Ticket ticket) {
        if (ticket.count > 0) {
            System.out.println(location + name);
            System.out.println("Двери открываются");
            ticket.count = ticket.count - 1;
            System.out.println("Оставшееся количество поездок " + ticket.count);
        } else {
            System.out.println(Ticket.nameOfTicket + " не действителен");
            System.out.println("Количество поездок " + ticket.count);
        }
        System.out.println();
    }
}
