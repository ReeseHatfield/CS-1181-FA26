public class Student extends Object implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public void goToClass(){
        System.out.println("Attends CS-1181");
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public int compareTo(Student other) {
        // what the two instances of student
        // other
        // this

        if(this.gpa > other.gpa){
            return -1;
        }
        else if(this.gpa < other.gpa) {
            return +1;
        }
        else {
            return 0;
        }

        // Double.compare(gpa, gpa)

    }
}
