package DoublyLinkedList.moviemanagementsystem;

import java.util.Scanner;

public class MovieManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Add movie at the beginning");
            System.out.println("2. Add movie at the end");
            System.out.println("3. Add movie at the position");
            System.out.println("4. Delete movie by Movie Title");
            System.out.println("5. Search movie by Director name");
            System.out.println("6. Search movie by Rating");
            System.out.println("7. Display movies details in forward order");
            System.out.println("7. Display movies details in reverse order");
            System.out.println("9. Update grade of the movie by Movie Title");
            System.out.println("10. Exit");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter Movie Title, Director, Year of Release and Rating: ");
                    MovieOperations.addAtBeginning(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter Movie Title, Director, Year of Release and Rating: ");
                    MovieOperations.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
                    break;
                case 3:
                    System.out.print("Movie Title, Director, Year of Release and Rating, Enter Position: ");
                    MovieOperations.addAtSpecific(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Movie Title to delete: ");
                    MovieOperations.deleteByMovieTitle(sc.next());
                    break;
                case 5:
                    System.out.print("Enter Movie Title to search: ");
                    MovieOperations.searchByDirector(sc.next());
                    break;
                case 6:
                    System.out.println("Enter Rating to search");
                    MovieOperations.searchByRating(sc.nextInt());
                    break;
                case 7:
                    MovieOperations.displayRecordsInForward();
                    break;
                case 8:
                    MovieOperations.displayRecordsInReverse();
                    break;
                case 9:
                    System.out.print("Enter Movie Title and new Rating: ");
                    MovieOperations.updateRatingByMovieTitle(sc.next(), sc.nextInt());
                    break;
                case 10:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
