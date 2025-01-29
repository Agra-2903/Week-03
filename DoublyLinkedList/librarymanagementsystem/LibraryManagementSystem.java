package DoublyLinkedList.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Add book at the beginning");
            System.out.println("2. Add book at the end");
            System.out.println("3. Add book at the position");
            System.out.println("4. Delete book by Book Id");
            System.out.println("5. Search book by Book Title");
            System.out.println("6. Search book by Author");
            System.out.println("7. Display books details in forward order");
            System.out.println("7. Display books details in reverse order");
            System.out.println("9. Update availability of the book by book Title");
            System.out.println("10. Count number of books in the library");
            System.out.println("11. Exit");

            int option = sc.nextInt();
            sc.nextLine(); //Clear buffer

            switch (option){
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title1 = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author1 = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre1 = sc.next();
                    System.out.print("Enter Book ID: ");
                    String bookId1 = sc.next();
                    LibraryOperations.addAtBeginning(title1, author1, genre1, bookId1);
                    break;
                case 2:
                    System.out.print("Enter Book Title: ");
                    String title2 = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author2 = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre2 = sc.next();
                    System.out.print("Enter Book ID: ");
                    String bookId2 = sc.next();
                    LibraryOperations.addAtEnd(title2, author2, genre2, bookId2);
                    break;
                case 3:
                    System.out.print("Enter Book Title: ");
                    String title3 = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author3 = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre3 = sc.next();
                    System.out.print("Enter Book ID: ");
                    String bookId3 = sc.next();
                    System.out.print("Enter Position");
                    int position = sc.nextInt();
                    LibraryOperations.addAtSpecific(title3, author3, genre3, bookId3, position);
                    break;
                case 4:
                    System.out.print("Enter Book Id to delete: ");
                    LibraryOperations.deleteByBookId(sc.next());
                    break;
                case 5:
                    System.out.print("Enter Book Title to search: ");
                    LibraryOperations.searchByBookTitle(sc.nextLine());
                    break;
                case 6:
                    System.out.println("Enter Author to search");
                    LibraryOperations.searchByAuthor(sc.nextLine());
                    break;
                case 7:
                    LibraryOperations.displayRecordsInForward();
                    break;
                case 8:
                    LibraryOperations.displayRecordsInReverse();
                    break;
                case 9:
                    System.out.print("Enter Book Title and Availability status(in true or false): ");
                    LibraryOperations.updateAvailabilityByBookId(sc.next(), sc.nextBoolean());
                    break;
                case 10:
                    LibraryOperations.countBooks();
                    break;
                case 11:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
