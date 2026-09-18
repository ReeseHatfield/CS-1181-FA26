public class Student implements Comparable<Student> {

    private int rank;
    public Student(int rank){
        this.rank = rank;
    }

    @Override
    public int compareTo(Student other) {
        if(this.rank < other.rank){
            return -1;
        }
        else if(this.rank > other.rank) {
            return +1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "" + rank;
    }
    
}
