package DoublyLinkedList.moviemanagementsystem;

public class MovieOperations {
    private static MovieNode head;
    private static MovieNode tail;

    public static void addAtBeginning(String movieTitle, String director, int yearOfRelease, int rating) {
        MovieNode movie = new MovieNode(movieTitle, director, yearOfRelease, rating);
        if(head == null){
            head = tail = movie;
        }
        else{
            movie.next = head;
            head.back = movie;
            head = movie;
        }
        System.out.println("Movie added at the beginning");
    }

    public static void addAtEnd(String movieTitle, String director, int yearOfRelease, int rating) {
        MovieNode movie = new MovieNode(movieTitle, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = movie;
            System.out.println("Movie added at the end.");
            return;
        }
        else {
            tail.next = movie;
            movie.back = tail;
            tail = movie;
        }

        System.out.println("Movie added at the end");
    }

    public static void addAtSpecific(String movieTitle, String director, int yearOfRelease, int rating, int index) {
        if (index == 1) {
            addAtBeginning(movieTitle, director, yearOfRelease, rating);
            return;
        }

        MovieNode movie = new MovieNode(movieTitle, director, yearOfRelease, rating);

        int counter = 1;
        MovieNode temp = head;
        MovieNode prev = null;

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

        prev.next = movie;
        movie.back = prev;
        movie.next = temp;
        temp.back = movie;
    }

    public static void deleteByMovieTitle(String movieTitle){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        MovieNode temp = head;
        MovieNode prev = null;
        while(!temp.getMovieTitle().equals(movieTitle)){
            if(temp != null){
                System.out.println(movieTitle + " record not found");
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
            prev = temp.back;
            prev.next = temp.next;
            temp.next.back = prev;
            temp.next = null;
            temp.back = null;
        }
    }

    public static void searchByDirector(String director){
        MovieNode temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.getDirector().equals(director)){
                found = true;
                System.out.printf("%-20s%-15s%-15s%-7s%n", "Movie Title", "Director", "Year of Release", "Rating");
                System.out.printf("%-20s%-15s%-15d%-7d%n", temp.getMovieTitle(), temp.getDirector(), temp.getYearOfRelease(), temp.getRating());
            }
            temp = temp.next;
        }

        if(!found){
            System.out.println(director + " record not found");
        }
    }

    public static void searchByRating(int rating){
        MovieNode temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.getRating() == rating){
                found = true;
                System.out.printf("%-20s%-15s%-15s%-7s%n", "Movie Title", "Director", "Year of Release", "Rating");
                System.out.printf("%-20s%-15s%-15d%-7d%n", temp.getMovieTitle(), temp.getDirector(), temp.getYearOfRelease(), temp.getRating());
            }
            temp = temp.next;
        }

        if(!found){
            System.out.println(rating + " record not found");
        }
    }

    public static void updateRatingByMovieTitle(String movieTitle, int rating){
        if(head == null){
            System.out.println("Record is empty");
            return;
        }

        MovieNode temp = head;
        while(!temp.getMovieTitle().equals(movieTitle)){
            if(temp != null){
                System.out.println(movieTitle + " record not found");
                return;
            }
            temp = temp.next;
        }

        temp.setRating(rating);
    }

    public static void displayRecordsInForward(){
        MovieNode temp = head;
        System.out.printf("%-20s%-15s%-15s%-7s%n", "Movie Title", "Director", "Year of Release", "Rating");
        while (temp != null){
            System.out.printf("%-20s%-15s%-15d%-7d%n", temp.getMovieTitle(), temp.getDirector(), temp.getYearOfRelease(), temp.getRating());
            temp = temp.next;
        }
    }

    public static void displayRecordsInReverse(){
        MovieNode temp = tail;
        System.out.printf("%-20s%-15s%-15s%-7s%n", "Movie Title", "Director", "Year of Release", "Rating");
        while (temp != null){
            System.out.printf("%-20s%-15s%-15d%-7d%n", temp.getMovieTitle(), temp.getDirector(), temp.getYearOfRelease(), temp.getRating());
            temp = temp.back;
        }
    }
}
