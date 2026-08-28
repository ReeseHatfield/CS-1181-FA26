// open for extension (Student)
// closed for modifcation
public class UnderGradStudent extends Student {

    public UnderGradStudent(String name, double gpa) {
        super(name, gpa);
    }

    @Override
    public void goToClasses() {
        System.out.println("Goes to CS-1181");
        System.out.println("Goes to CS-2200");
    }

}