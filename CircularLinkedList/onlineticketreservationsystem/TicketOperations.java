package CircularLinkedList.onlineticketreservationsystem;

public class TicketOperations {
    private static TicketNode head;
    private static TicketNode tail;

    public static void addAtEnd(String ticketId, String customerName, String movieName, int seatNumber){
        TicketNode ticket = new TicketNode(ticketId, customerName, movieName, seatNumber);

        if(head == null){
            head = tail = ticket;
            System.out.println("Ticket booked");
            return;
        }

        ticket.next = head;
        tail.next = ticket;
        tail = ticket;
        System.out.println("Ticket booked");
    }

    public static void deleteByTicketId(String ticketId){
        if(head == null){
            System.out.println("No tickets booked");
            return;
        }

        if(head.getTicketId().equals(ticketId)){
            tail.next = head.next;
            head = head.next;
            System.out.println(ticketId + " task is deleted");
            return;
        }

        TicketNode temp = head;
        TicketNode prev = tail;
        while (!temp.getTicketId().equals(ticketId)){
            if(temp.next == head){
                System.out.println(ticketId + " task not present");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        temp = temp.next;
        prev.next = temp;
        System.out.println(ticketId + " task is deleted");
    }

    public static void searchByCustomerName(String customerName){
        if(head == null){
            System.out.println("Task list is empty");
            return;
        }

        if(head.getCustomerName().equals(customerName)){
            System.out.printf("%-10s%-20s%-25s%-12s%-12s%n", "Ticket Id", "Customer Name", "Movie Name", "Seat Number", "Booking Time");
            System.out.printf("%-10s%-20s%-25s%-12d%-12s%n", head.getTicketId(), head.getCustomerName(), head.getMovieName(), head.getSeatNumber(), head.getBookingTime());
        }

        TicketNode temp = head.next;
        while (temp != head) {
            if(head.getCustomerName().equals(customerName)){
                System.out.printf("%-10s%-20s%-25s%-12s%-12s%n", "Ticket Id", "Customer Name", "Movie Name", "Seat Number", "Booking Time");
                System.out.printf("%-10s%-20s%-25s%-12d%-12s%n", temp.getTicketId(), temp.getCustomerName(), temp.getMovieName(), temp.getSeatNumber(), temp.getBookingTime());
            }
            temp = temp.next;
        }

        System.out.println("No ticket is booked by " + customerName);
    }

    public static void searchByMovieName(String movieName){
        if(head == null){
            System.out.println("Task list is empty");
            return;
        }

        if(head.getMovieName().equals(movieName)){
            System.out.printf("%-10s%-20s%-25s%-12s%-12s%n", "Ticket Id", "Customer Name", "Movie Name", "Seat Number", "Booking Time");
            System.out.printf("%-10s%-20s%-25s%-12d%-12s%n", head.getTicketId(), head.getCustomerName(), head.getMovieName(), head.getSeatNumber(), head.getBookingTime());
        }

        TicketNode temp = head.next;
        while (temp != head) {
            if(temp.getMovieName().equals(movieName)){
                System.out.printf("%-10s%-20s%-25s%-12s%-12s%n", "Ticket Id", "Customer Name", "Movie Name", "Seat Number", "Booking Time");
                System.out.printf("%-10s%-20s%-25s%-12d%-12s%n", temp.getTicketId(), temp.getCustomerName(), temp.getMovieName(), temp.getSeatNumber(), temp.getBookingTime());
            }
            temp = temp.next;
        }

        System.out.println("No ticket booked of " + movieName);
    }

    public static void totalTicketsBooked(){
        if(head == null){
            System.out.println("No tickets booked");
            return;
        }

        int count = 1;
        TicketNode temp = head.next;
        while(temp != head){
            count++;
            temp = temp.next;
        }

        System.out.println(count + " tickets are booked");
    }

    public static void displayTicketsList(){
        if(head == null){
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        System.out.printf("%-10s%-20s%-25s%-12s%-12s%n", "Ticket Id", "Customer Name", "Movie Name", "Seat Number", "Booking Time");
        while (temp != tail){
            System.out.printf("%-10s%-20s%-25s%-12d%-12s%n", temp.getTicketId(), temp.getCustomerName(), temp.getMovieName(), temp.getSeatNumber(), temp.getBookingTime());
            temp = temp.next;
        }
        System.out.printf("%-10s%-20s%-25s%-12d%-12s%n", tail.getTicketId(), tail.getCustomerName(), tail.getMovieName(), tail.getSeatNumber(), tail.getBookingTime());
    }
}
