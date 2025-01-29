package DoublyLinkedList.moviemanagementsystem;

public class MovieNode {
    private String movieTitle;
    private String director;
    private int yearOfRelease;
    private int rating;
    MovieNode next;
    MovieNode back;

    public MovieNode(String movieTitle, String director, int yearOfRelease, int rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.back = null;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
