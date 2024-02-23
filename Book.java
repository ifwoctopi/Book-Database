import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Book {
    private String title;
  private int year;
   private String publisher;
   private String genre;
  private double rating;
   private double price;
  private Author author;
    public Book() {

    }

    public Book(Author author, String title, int year, String publisher, String genre, double rating, double price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.rating = rating;
        this.price = price;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public  void setRating(double rating) {
        this.rating = rating;
    }

    public  String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    private static NumberFormat formatter = new DecimalFormat("#0.00");

@Override
public String toString() {
    return String.format("Author: %s\nTitle: %s\r\nYear: %s\r\nGenre: %s\r\nPublisher: %s\r\nRating: %s\r\nPrice: $%s\r\n\n",
            author,title, year, genre, publisher, rating, formatter.format(price));
}

    }










