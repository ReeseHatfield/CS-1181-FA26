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


        Media m = new Movie();
        m.consume();

        AudioBook ab = new AudioBook();
        ab.borrow();
        m.borrow();

        System.out.println();
        System.out.println();
        System.out.println();


        // vg.interact();
        
        VideoGames vg = new VideoGames();
        rent(vg);
        rent(new AudioBook());
        
    }

    /**
     * Rent something that is borrowable
     * @param b the thing to borrow
     * @return the time left on the rental
     */
    public static int rent(Borrowable b){
        
        if(b instanceof VideoGames){
            VideoGames myGame = (VideoGames) b;

            myGame.interact();
        } else if(b instanceof AudioBook) {
            System.out.println("B was an audiobook");
        }
        else {
            b.borrow();
        }

        return 30;
        

    }
}