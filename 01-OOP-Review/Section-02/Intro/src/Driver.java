public class Driver {
    public static void main(String[] args){
        System.out.println("hello");

        Student s1 = new Student("Alice", 4.0);
        // s1.setName("Alice");
        // s1.name = "Reese";

        Student s2 = new Student("Bob", 4.0);
        // s2.setName("Bob");

        System.out.println(s1.getName());
        System.out.println(s2.getName());
        s1.goToClass();

        // Student s3 = new Student();
    }
}