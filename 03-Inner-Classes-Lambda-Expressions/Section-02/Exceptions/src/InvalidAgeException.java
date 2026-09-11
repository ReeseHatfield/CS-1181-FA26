// public class InvalidAgeException extends Exception {
public class InvalidAgeException extends RuntimeException {

    // private String msg;


    public InvalidAgeException(String msg){
        // this.msg = msg;
        super(msg);
        // super(this.msg);
    }
}
