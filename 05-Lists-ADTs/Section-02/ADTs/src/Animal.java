public class Animal implements Comparable<Animal> {
    private double weight;

    public Animal(double weight){
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal other) {
        if(this.weight < other.weight){
            return -1;
        }
        else if(this.weight > other.weight){
            return +1;
        }
        else {
            return 0;
        }
    }

    public String toString(){
        return "" + this.weight;
    }
}
