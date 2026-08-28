public class Driver {
    public static void main(String[] args){
        // once I have a student (of some kind)
        // student.goToClasses()
        // Grad students go to CS-7200, CS-7380

        // undergrads go to CS-1181 CS-2200


        // Student s = new Student(...)
        // s.goToClasses()

        processStudent(new UnderGradStudent("Alice", 4.0));
        processStudent(new GradStudent("Bob", 2.5));


        GradStudent gs = new GradStudent("Charlie", 3.9);

        gs.driveToCampus();

        Faculty f = new Faculty("Derek");
        f.driveToCampus();

        // declared type as a commuter
        // runtime actual type faculty
        Commuter c = new Faculty("Elijah");

        // c.teachClass

        processCommuter(new Faculty("Reese"));
        processCommuter(new GradStudent("Alice Two", 5.0));
    }

    public static void processStudent(Student s){
        System.out.println("Processing student:");
        s.goToClasses();
    }

    public static void processCommuter(Commuter c){
        System.out.println("Processing commuter");
        // dynamically searching the correct implementation at RUNTIME
        // dynamic dispatch -> keyword
        c.driveToCampus();
    }
}