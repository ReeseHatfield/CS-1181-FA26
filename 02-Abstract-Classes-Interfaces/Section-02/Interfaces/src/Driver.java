import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(-5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Object s1 = new Student("Alice", 4.0);
        Student s1 = new Student("Alice", 4.0);
        Student s2 = new Student("Bob", 4.0);
        Student s3 = new Student("Charlie", 3.6);
        Student s4 = new Student("Derek", 2.7);
        Student s5 = new Student("Eli", 3.6);

        ArrayList<Student> roster = new ArrayList<>();
        roster.add(s4);
        roster.add(s3);
        roster.add(s2);
        roster.add(s5);
        roster.add(s1);

        System.out.println("Before: " + roster);
        Collections.sort(roster);
        System.out.println("After: " + roster);
        // Colelctions.sort()
        
        // System.out.println(s1.toString());

        LogList ll = new LogList();
        ll.addLog("Event 1");
        ll.addLog("Event 2");
        // ll.clear();
        ll.addLog("Event 3");
        ll.addLog("Event 4");
        ll.addLog("Event 5");
        // ...


        ll.printEveryOther();
    }
}