class ticketbooking{
    int available tickets = 10;
    synchronized void bookTicket(String customerName, int ticket){
        System.out.println(customerName +"wants to book"+tickets+"tickets");
        if(tickets<=availabletickets){
            System.out.println(customerName + "is booking tickets...");
            try {
                Thread.slee(4000);
                
            }
             catch (InterupptedException e) {
                System.out.println(e);
            }
            availabletickets = availabletickets-tickets;
            System.out.println(customerName + "successfully booked" + tickets + "tickets");
        }
    }
}