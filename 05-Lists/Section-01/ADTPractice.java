import java.util.*;

public class ADTPractice
{
    public static void main(String[] args)
    {
        // functionally identical aside from some operations being faster/slower
        List<String> names = new LinkedList<>();
        List<String> names2 = new ArrayList<>();

        names.add("bob");
        names.get(0);


        // stack is a LIFO structure
        Stack<String> dirtyDishes = new Stack<>();
        dirtyDishes.push("cup");
        dirtyDishes.push("plate");
        dirtyDishes.push("bowl");
        System.out.println(dirtyDishes.peek());

        while (!dirtyDishes.isEmpty())
        {
            System.out.println(dirtyDishes.pop());
        }


        // both implementations of queue are functionally identical
        Queue<String> customers = new LinkedList<>();
        Queue<String> customers2 = new ArrayDeque<>();

        // Queue follows FIFO policy
        customers.offer("bob");
        customers.offer("alice");
        customers.offer("fred");
        System.out.println(customers.peek());

        while (!customers.isEmpty())
        {
            System.out.println(customers.poll());
        }

        customers2.offer("bob");
        customers2.offer("alice");
        customers2.offer("fred");
        System.out.println(customers2.peek());

        while (!customers2.isEmpty())
        {
            System.out.println(customers2.poll());
        }


        // ensures that the head of the queue is the next item in a custome order
        // will use natural ordering (comparable/compareTo) if available
        // will use a comparator if provided
        Queue<String> callers = new PriorityQueue<>(new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                return o2.compareTo(o1);
            }
        });
        callers.offer("charlie");
        callers.offer("zayne");
        callers.offer("hayley");
        callers.offer("alice");

        System.out.println(callers.peek());
        System.out.println(callers);
        callers.offer("tom");
        System.out.println(callers);

        while(!callers.isEmpty())
        {
            System.out.println(callers.poll());
            System.out.println(callers);
        }


        Set<String> colors = new HashSet<>();
        Set<String> colors2 = new TreeSet<>();

        colors.add("red");
        colors.add("orange");
        System.out.println(colors.add("blue"));
        // returns false, because red is a duplicate and is not added to the set
        System.out.println(colors.add("red"));
        System.out.println(colors);

        System.out.println(colors.remove("red"));
        System.out.println(colors);


        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Integer> wordCount2 = new TreeMap<>();

        wordCount.put("the", 32);
        wordCount.put("quick", 81);
        wordCount.put("brown", 32);
        wordCount.put("fox", 5);
        wordCount.put("the", 32);

        System.out.println(wordCount);
        System.out.println(wordCount.keySet());
        System.out.println(wordCount.values());


    }
}
