import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
    public static void main(String[] args){
        Book b1 = new Book(40.5, 0.99, "Mark Twain");
        Book b2 = new Book(30.5, 10.99, "Alice Twain");
        Book b3 = new Book(15, 3.99, "Bob Twain");
        Book b4 = new Book(89.5, 10.99, "Charlie Twain");
        Book b5 = new Book(47.5, 10.99, "Derek Twain");

        // int result = pc.compare(b1, b2);
        
        ArrayList<Book> list = new ArrayList<>();
        
        list.add(b3);
        list.add(b2);
        list.add(b5);
        list.add(b4);
        list.add(b1);
        
        Collections.sort(list, new PriceComparator());

        System.out.println(list);
        System.out.println();
        System.out.println();
        System.out.println();

        Book myFavoriteBook = new Book(65.4, 0.00, "Reese");
        // later on 
        // deep copy
        Book hisFavoriteBook = new Book(myFavoriteBook);
        hisFavoriteBook.setAuthor("Bob");

        // shallow copy
        // Book hisFavoriteBook = myFavoriteBook;
        // hisFavoriteBook.setAuthor("Bob");

        // later on
        System.out.println(myFavoriteBook);



        // System.out.println("Hello".compareTo("World"));

    }
}