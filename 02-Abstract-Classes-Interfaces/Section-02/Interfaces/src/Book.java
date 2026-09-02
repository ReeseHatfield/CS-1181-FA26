public class Book extends Media {

    @Override
    public void consume() {
        System.out.println("Reads a book");
    }

    @Override
    public void borrow() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrow'");
    }
    
}
