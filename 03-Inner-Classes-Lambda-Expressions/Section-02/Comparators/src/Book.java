public class Book implements Comparable<Book> {
    private double deweyDecimal;
    private double price;
    private String author;
    // private Item 
    private String title = "Untitled";

    
    public void setAuthor(String author) {
        this.author = author;
    }



    public double getPrice() {
        return price;
    }



    public String getAuthor() {
        return author;
    }


    public Book(double ddNumber, double price, String author){
        this.deweyDecimal = new Double(ddNumber);
        this.price = new Double(price);
        this.author = new String(author);
    }

    public Book(Book other){
        this.author = other.author;
        this.deweyDecimal = other.deweyDecimal;
        this.price = other.price;
    }


    @Override
    public String toString(){
        return "[DD Number: " + this.deweyDecimal + ", Price: " + price + " by " + author + "]\n" ;
    }


    @Override
    public int compareTo(Book other) {

        if(this.deweyDecimal < other.deweyDecimal){
            return -1;
        }
        else if(this.deweyDecimal > other.deweyDecimal){
            return +1;
        }
        else {
            return 0;
        }
    }


}
