public abstract class Media extends Object implements Borrowable {
    public abstract void consume();

    public void borrow(){
        System.out.println("Borrows media");
    }
}
