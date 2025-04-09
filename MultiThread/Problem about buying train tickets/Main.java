package baitap;

public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        Thread khuA = new Thread(new TicketBooth(ticketSystem, "Khu A"));
        Thread khuB = new Thread(new TicketBooth(ticketSystem, "Khu B"));
        Thread khuC = new Thread(new TicketBooth(ticketSystem, "Khu C"));

        khuA.start();
        khuB.start();
        khuC.start();
    }
}