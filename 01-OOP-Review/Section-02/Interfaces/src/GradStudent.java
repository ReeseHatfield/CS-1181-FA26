public class GradStudent extends Student implements Commuter {

    public GradStudent(String name, double gpa) {
        super(name, gpa);
    }

    @Override
    public void goToClasses() {
        System.out.println("Goes to CS-7200");
        System.out.println("Goes to CS-7380");
    }
    // interface -> contract 

    @Override
    public void driveToCampus(){
        System.out.println(super.getName() + " drives to campus");
    }
    
}
