import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Driver {
    public static void main(String[] args) {
        ChatBot cb = new ChatBot("RnJ.txt");
        Scanner keyboard = new Scanner(System.in);

        Stack<Queue<String>> adts = new Stack<>();

        Storable s1 = new Storable() {
            @Override
            public String store(int i){
                System.out.println("value of i was " + i);
                return "Hello";
            }
        };

        s1.store(4);

        Storable s2 = (i) -> {
            System.out.println("value of i was " + i);
            return "Hello";
        };

        System.out.println(s2.store(6));


        System.out.println();
        System.out.println();
        System.out.println();

        // List<String>
        adts.push(new LinkedList<>());
        PriorityQueue<Integer> ints = new PriorityQueue<Integer>((i1, i2) -> {
            return -1 * Integer.compare(i1, i2);
        });
        ints.offer(3);
        ints.offer(2);
        ints.offer(1);
        ints.offer(0);

        while(!ints.isEmpty()){
            System.out.println(ints.poll());
        }

        // adts.pop().poll().charAt(0);


        // ArrayList<AbsParent> list = new ArrayList<();
        // polymorphism



        while(true){
            System.out.print(">>>");
            String input = keyboard.nextLine();

            String response = cb.reply(input);

            delayPrint(response);
            
        }
    
        // keyboard.close();
    }

    public static void delayPrint(String s){

        for(char c: s.toCharArray()){
            try {
                Thread.sleep(20);
                System.out.print(c);
            } catch (InterruptedException e) {}
        }
    }
}