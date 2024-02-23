import java.util.ArrayList;




public class BookDatabase {


    private ArrayList<Book> books = new ArrayList<Book>();


    public BookDatabase() {
        this.books = new ArrayList<>();

    }


    public BookDatabase(ArrayList<Book> books) {
        this.books = books;

    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }


    public ArrayList<Book> searchAuthor(String author) {
        System.out.println("Searching for..." + author);
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : this.books) {
            String searchedAuthor = book.getAuthor().getName();

            if (searchedAuthor.equals(author)){
                results.add(book);

            }

        }

        return results;
    }
    public ArrayList<Book> searchTimeRange(int startYear, int endYear) {
        System.out.println("Searching for times between... " +  startYear + " - " + endYear);
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : this.books) {
            int searchedTime = book.getYear();


            if (searchedTime > startYear && searchedTime < endYear){
                results.add(book);
            }

        }

        return results;
    }
    public ArrayList<Book> searchGenre(String genre) {
        System.out.println("Searching for..." + genre);
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : this.books) {
            String searchedGenre = book.getGenre();

            if (searchedGenre.equals(genre)){
                results.add(book);

            }

        }

        return results;
    }



}










