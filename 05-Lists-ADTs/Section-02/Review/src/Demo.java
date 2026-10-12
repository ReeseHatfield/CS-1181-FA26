import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

interface Rideable {
    // defines a contract of what methods 
    // need to be implemented
    public void ride(int distance);
}

abstract class Vehicle {
    private String color = "Red";

    public abstract void drive();

    public void honkHorn() {
        System.out.println("Honks horn");
    }

}

class Motorcycle extends Vehicle implements Rideable, Comparable<Motorcycle>{

    @Override
    public void ride(int distance) {
        System.out.println("Drives " + distance + " miles");
    }

    @Override
    public void drive() {
        // concrete implementation here
    }

    @Override
    public int compareTo(Motorcycle arg0) {
        return 0;
    }

}

public class Demo {
    public static void main(String[] args){
        Rideable r1 = new Motorcycle();

        Rideable r2 = new Rideable() {
            @Override
            public void ride(int distance) {
                System.out.println("Drives " + distance + " miles");
            }
        };

        Rideable r3 = (distance) -> {
            System.out.println("Drives " + distance + " miles");
        };

        r1.ride(4);
        r2.ride(4);
        r3.ride(4);


        // PriorityQueue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(3);
        q1.offer(5);
        q1.offer(4);
        q1.offer(1);
        q1.offer(2);

        System.out.println(q1.poll());

        Set<Integer> s1 = new HashSet<>();

        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(1);
        s1.add(2);

        System.out.println(s1);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Zack", 7);
        myMap.put("Reese", 0);
        myMap.put("Alice", 3);

        System.out.println(myMap.get("Zack"));

    }
}