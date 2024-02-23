
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class clientProgram {

    public static BookDatabase library = new BookDatabase();

    public static void main(String[] args) {
        ArrayList<Book> newBooks = new ArrayList<Book>();


        try {

            File myObj = new File("C:\\Users\\Staci\\Downloads\\dataset.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            String[] dataSet;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataSet = data.split(",");
                //System.out.println(Arrays.toString(dataSet));
                Author author = new Author();
                Book book = new Book();


                author.setFirstName(dataSet[0]);
                author.setLastName(dataSet[1]);

                book.setAuthor(author);
                book.setTitle(dataSet[2]);
                book.setYear(Integer.parseInt(dataSet[3]));
                book.setGenre(dataSet[5]);
                book.setPublisher(dataSet[4]);
                book.setRating(Double.valueOf((dataSet[6])));
                book.setPrice(Double.valueOf((dataSet[7]).substring(1)));

                newBooks.add(book);

            }
            library.setBooks(newBooks);

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        //System.out.print(library.getBooks());
        System.out.print(library.searchAuthor("Werner Sollors") + "\n");
        System.out.print(library.searchTimeRange(2000,2005) + "\n");
        System.out.print(library.searchGenre("Slavery") + "\n");

        Book testBook = new Book();
        Author staci = new Author();
        staci.setFirstName("Staci");
        staci.setLastName("Tranquille");

        testBook.setAuthor(staci);
        testBook.setTitle("I Finished the Project");
        testBook.setYear(2024);
        testBook.setGenre("Inspirational");
        testBook.setPublisher("None");
        testBook.setRating(5.0);
        testBook.setPrice(0.00);
        library.addBook(testBook);
        System.out.print(library.getBooks() + "\n" );

        library.removeBook(testBook);
        System.out.print(library.getBooks());
    }



   }

