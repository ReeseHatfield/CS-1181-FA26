import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        Stack<String> myStack = new Stack<>();
        myStack.push("Hello");
        myStack.push("My");
        myStack.push("Name");
        myStack.push("is");
        myStack.push("Reese");

        String top = myStack.peek();

        System.out.println(top);

        System.out.println(myStack.pop());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }


        System.out.println();
        System.out.println();
        System.out.println();

        Queue<String> q = new LinkedList<>();

        q.offer("Alice");
        q.offer("Bob");
        q.offer("Charlie");
        q.offer("Derek");

        System.out.println(q.poll());
        System.out.println(q.peek());


        System.out.println();
        System.out.println();
        System.out.println();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(6);
        pq.offer(3);
        pq.offer(2);
        pq.offer(9);
        pq.offer(5);

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        PriorityQueue<Animal> animals = new PriorityQueue<>();
        animals.offer(new Animal(6.8));
        animals.offer(new Animal(1.2));
        animals.offer(new Animal(3.5));
        animals.offer(new Animal(2.0));
        animals.offer(new Animal(7.5));

        while(!animals.isEmpty()){
            System.out.println(animals.poll());
        }

        // while pq is not empty
        // {
        // if next event instance of TruckStart
        //  -> offer a TaC
        // else if next event instace of TaC
        // -> maybe add TCC
        // -> maybe add truck to a queue
        // }


    }
}