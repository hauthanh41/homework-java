package baitap;

class TicketSystem {
    private int tickets = 100; // Tổng số vé

    public synchronized boolean sellTicket(String khuVuc) {
        if (tickets > 0) {
            System.out.println(khuVuc + " đã bán vé số: " + tickets);
            tickets--;
            return true;
        } else {
            return false; // Hết vé
        }
    }
}

class TicketBooth implements Runnable {
    private TicketSystem ticketSystem;
    private String khuVuc;

    public TicketBooth(TicketSystem ticketSystem, String khuVuc) {
        this.ticketSystem = ticketSystem;
        this.khuVuc = khuVuc;
    }

    @Override
    public void run() {
        while (ticketSystem.sellTicket(khuVuc)) {
            try {
                Thread.sleep(100); // Giả lập thời gian bán vé
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


