package DoublyLinkedList.librarymanagementsystem;

public class LibraryNode {
    private String bookTitle;
    private String author;
    private String genre;
    private final String bookId;
    private boolean availability;
    LibraryNode next;
    LibraryNode back;

    public LibraryNode(String bookTitle, String author, String genre, String bookId) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availability = true;
        this.next = null;
        this.back = null;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getBookId() {
        return bookId;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
