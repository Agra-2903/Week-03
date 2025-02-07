package CircularLinkedList.onlineticketreservationsystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TicketNode {
    private final String ticketId;
    private String customerName;
    private String movieName;
    private int seatNumber;
    private String bookingTime;
    TicketNode next;

    public TicketNode(String ticketId, String customerName, String movieName, int seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.bookingTime = currentTime.format(formatter);

        this.next = null;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getBookingTime() {
        return bookingTime;
    }
}
