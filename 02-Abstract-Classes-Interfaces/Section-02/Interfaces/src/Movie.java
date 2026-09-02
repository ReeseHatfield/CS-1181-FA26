public class Movie extends Media {

    @Override
    public void consume() {
        System.out.println("Watches movie");
    }

    @Override
    public void borrow() {
        System.out.println("Borrows movie");
    }
    
    
}
