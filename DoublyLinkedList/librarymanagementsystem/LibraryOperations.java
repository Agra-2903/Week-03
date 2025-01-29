package DoublyLinkedList.librarymanagementsystem;

public class LibraryOperations {
    private static LibraryNode head;
    private static LibraryNode tail;

    public static void addAtBeginning(String bookTitle, String author, String genre, String bookId) {
        LibraryNode book = new LibraryNode(bookTitle, author, genre, bookId);
        if(head == null){
            head = tail = book;
        }
        else{
            book.next = head;
            head.back = book;
            head = book;
        }
        System.out.println("Book added at the beginning");
    }

    public static void addAtEnd(String bookTitle, String author, String genre, String bookId) {
        LibraryNode book = new LibraryNode(bookTitle, author, genre, bookId);
        if (head == null) {
            head = tail = book;
            System.out.println("Book added at the end.");
            return;
        }
        else {
            tail.next = book;
            book.back = tail;
            tail = book;
        }

        System.out.println("Book added at the end");
    }

    public static void addAtSpecific(String bookTitle, String author, String genre, String bookId, int index) {
        if (index == 1) {
            addAtBeginning(bookTitle, author, genre, bookId);
            return;
        }

        LibraryNode book = new LibraryNode(bookTitle, author, genre, bookId);

        int counter = 1;
        LibraryNode temp = head;
        LibraryNode prev = null;

        while (counter != index) {
            if (temp != null) {
                prev = temp;
                temp = temp.next;
                counter++;
            } else {
                System.out.println("Invalid index");
                return;
            }
        }

        prev.next = book;
        book.back = prev;
        book.next = temp;
        temp.back = book;
    }

    public static void deleteByBookId(String bookId){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        LibraryNode temp = head;
        while(!temp.getBookId().equals(bookId)){
            if(temp != null){
                System.out.println(bookId + " record not found");
                return;
            }
            temp = temp.next;
        }

        if(temp == head){
            head = temp.next;
            temp.next = null;
        }
        else if(temp == tail){
            tail = temp.back;
            temp.back = null;
        }
        else{
            LibraryNode prev = temp.back;
            prev.next = temp.next;
            temp.next.back = prev;
            temp.next = null;
            temp.back = null;
        }
    }

    public static void searchByBookTitle(String bookTitle){
        LibraryNode temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.getBookTitle().equals(bookTitle)){
                found = true;
                System.out.printf("%-30s%-20s%-15s%-8s%-20s%n", "Book Title", "Author", "Genre", "Book Id", "Availability");
                System.out.printf("%-30s%-20s%-15s%-8s", temp.getBookTitle(), temp.getAuthor(), temp.getGenre(), temp.getBookId());
                if(temp.isAvailability()){
                    System.out.printf("%-20s%n", "Book available");
                }
                else{
                    System.out.printf("%-20s%n", "Book not available");
                }
            }
            temp = temp.next;
        }

        if(!found){
            System.out.println(bookTitle + " record not found");
        }
    }

    public static void searchByAuthor(String author){
        LibraryNode temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.getAuthor().equals(author)){
                found = true;
                System.out.printf("%-30s%-20s%-15s%-8s%-20s%n", "Book Title", "Author", "Genre", "Book Id", "Availability");
                System.out.printf("%-30s%-20s%-15s%-8s", temp.getBookTitle(), temp.getAuthor(), temp.getGenre(), temp.getBookId());
                if(temp.isAvailability()){
                    System.out.printf("%-20s%n", "Book available");
                }
                else{
                    System.out.printf("%-20s%n", "Book not available");
                }
            }
            temp = temp.next;
        }

        if(!found){
            System.out.println(author + " record not found");
        }
    }

    public static void updateAvailabilityByBookId(String bookId, boolean availability){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        LibraryNode temp = head;
        while(!temp.getBookId().equals(bookId)){
            if(temp != null){
                System.out.println(bookId + " record not found");
                return;
            }
            temp = temp.next;
        }

        temp.setAvailability(availability);
    }

    public static void countBooks(){
        LibraryNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        System.out.println("Library has " + count + " books.");
    }

    public static void displayRecordsInForward(){
        LibraryNode temp = head;
        System.out.printf("%-30s%-20s%-15s%-8s%n", "Book Title", "Author", "Genre", "Book Id");
        while (temp != null){
            System.out.printf("%-30s%-20s%-15s%-8s%n", temp.getBookTitle(), temp.getAuthor(), temp.getGenre(), temp.getBookId());
            temp = temp.next;
        }
    }

    public static void displayRecordsInReverse(){
        LibraryNode temp = tail;
        System.out.printf("%-30s%-20s%-15s%-8s%n", "Book Title", "Author", "Genre", "Book Id");
        while (temp != null){
            System.out.printf("%-30s%-20s%-15s%-8s%n", temp.getBookTitle(), temp.getAuthor(), temp.getGenre(), temp.getBookId());
            temp = temp.back;
        }
    }
}
