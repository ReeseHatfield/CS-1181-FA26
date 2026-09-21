
public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{
// public class Box<T> implements Comparable<Box<T>>{

    private T data;

    public Box(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    @Override
    public String toString(){
        return "A box containing " + data + "\n";
    }

    @Override
    public int compareTo(Box<T> other) {
        return this.getData().compareTo(other.getData());
    }
    
}
