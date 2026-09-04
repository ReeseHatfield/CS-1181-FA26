import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if(b1.getPrice() < b2.getPrice()){
            return -1;
        }
        else if(b1.getPrice() > b2.getPrice()){
            return +1;
        }
        else {
            // price are equal
            // lets now by String
            // if(b1.getAuthor() < b2.getAuthor()){

            // }
            int result = b2.compareTo(b1);
            return result;

        }
    }
    
}
