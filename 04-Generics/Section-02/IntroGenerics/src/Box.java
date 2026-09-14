public class Box <T> {

    private T data;

    public Box(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    @Override
    public String toString(){
        return "A box containing " + data;
    }
    
}
