import java.util.*;

public abstract class Student {
    private String name;
    
    public String getName() {
        return name;
    }

    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public abstract void goToClasses();


}
