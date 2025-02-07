package CircularLinkedList.onlineticketreservationsystem;

import java.util.Scanner;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Add ticket at the end");
            System.out.println("2. Delete ticket by Ticket Id");
            System.out.println("3. Search ticket by Customer Name");
            System.out.println("4. Search ticket by Movie Name");
            System.out.println("5. Display tickets booked");
            System.out.println("6. Count of total tickets booked");
            System.out.println("7. Exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.print("Enter Ticket Id: ");
                    String ticketId1 = sc.next();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName1 = sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName1 = sc.nextLine();
                    System.out.print("Enter Seat Number: ");
                    int seatNumber1 = sc.nextInt();
                    TicketOperations.addAtEnd(ticketId1, customerName1, movieName1, seatNumber1);
                    break;
                case 2:
                    System.out.print("Enter Ticket Id: ");
                    TicketOperations.deleteByTicketId(sc.next());
                    break;
                case 3:
                    System.out.print("Enter Customer Name to search: ");
                    String customerName = sc.nextLine();
                    TicketOperations.searchByCustomerName(customerName);
                    break;
                case 4:
                    System.out.print("Enter Movie Name to search: ");
                    String movieName = sc.nextLine();
                    TicketOperations.searchByMovieName(movieName);
                    break;
                case 5:
                    TicketOperations.displayTicketsList();
                    break;
                case 6:
                    TicketOperations.totalTicketsBooked();
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
