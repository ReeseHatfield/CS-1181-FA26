public class Pair<T1, T2> {
    private T1 thing1;
    private T2 thing2;

    public Pair(T1 thing1, T2 thing2){
        this.thing1 = thing1;
        this.thing2 = thing2;

    }

    public T1 getFirst(){
        return this.thing1;
    }

    public T2 getLast(){
        return this.thing2;
    }

    @Override
    public String toString(){
        return "A pair containing: " + thing1 + " and " + thing2;
    }
}

