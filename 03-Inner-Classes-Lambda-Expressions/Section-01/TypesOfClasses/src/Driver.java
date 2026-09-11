import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {

        // new InnerPriceComparator();

        getSortedListOfBook();

    }

    public static void getSortedListOfBook() {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(0.0, 4.99, "Emerson"));
        list.add(new Book(1.5, 1.99, "Hitchcock"));
        list.add(new Book(2.0, 3.99, "Alice"));

        class InnerPriceComparator implements Comparator<Book> {
            @Override
            public int compare(Book b1, Book b2) {
                if (b1.getPrice() < b2.getPrice()) {
                    return -1;
                } else if (b1.getPrice() > b2.getPrice()) {
                    return +1;
                } else {
                    int result = b2.compareTo(b1);
                    return result;

                }
            }
        }


        // Comparator<Book> comp = new InnerPriceComparator();

        // Collections.sort(list, comp);

        // // ... later on in my code

        // Collections.sort(list, comp);
        // System.out.println(list);

        // Comparator<Book> anonComp = new Comparator<Book>() {
        //     @Override
        //     public int compare(Book b1, Book b2) {
        //         if (b1.getPrice() < b2.getPrice()) {
        //             return -1;
        //         } else if (b1.getPrice() > b2.getPrice()) {
        //             return +1;
        //         } else {
        //             int result = b2.compareTo(b1);
        //             return result;

        //         }
        //     }
        // };

        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                if (b1.getPrice() < b2.getPrice()) {
                    return -1;
                } else if (b1.getPrice() > b2.getPrice()) {
                    return +1;
                } else {
                    int result = b2.compareTo(b1);
                    return result;

                }
            }
        });

        String s = "Waiting for ";

        Consumable c = (time) -> {
            System.out.println(s + time);
        };

        c.consume(50);
        c.consume(20);
        c.consume(10);

        // Comparator<Book> lambdaCompator = (b1, b2) ->{
        //     if (b1.getPrice() < b2.getPrice()) {
        //         return -1;
        //     } else if (b1.getPrice() > b2.getPrice()) {
        //         return +1;
        //     } else {
        //         int result = b2.compareTo(b1);
        //         return result;

        //     }
        // };

        // do not need specific dropping parens syntax
        // Consumable consume = time -> System.out.println();

        Collections.sort(list, (b1, b2) -> {
            if (b1.getPrice() < b2.getPrice()) {
                return -1;
            } else if (b1.getPrice() > b2.getPrice()) {
                return +1;
            } else {
                int result = b2.compareTo(b1);
                return result;

            }
        });
        System.out.println(list);



    }
}