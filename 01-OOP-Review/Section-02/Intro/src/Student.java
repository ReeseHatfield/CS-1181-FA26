public class Student {
    // fields
    private String name;
    private double gpa;
    // public String name;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    
    // methods 
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void goToClass(){
        System.out.println("Goes to CS-1181");
    }
}
