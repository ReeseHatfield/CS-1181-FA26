import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GenericIntro
{
    public static void main(String[] args)
    {
        ArrayList roster = new ArrayList();
        roster.add("clarissa");
        roster.add("reese");
        roster.add("bibek");

        System.out.println(roster);

        for (int i = 0; i < roster.size(); i++) {
            //roster.get(i).toUpperCase();
        }

        Randomizer<Number> lotteryDraw = new Randomizer<>();

        for (int i = 1; i <= 100; i++)
        {
            lotteryDraw.addItem(i);
        }
        lotteryDraw.addItem(4.6);

        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        //lotteryDraw.displayAllContents();


        ArrayList<Double> nums = new ArrayList<>(Arrays.asList(3.5, 213.5, 342.9, 31.7));

        lotteryDraw.addAll(nums);


//        Randomizer<Character> classRoster = new Randomizer<>();
//
//        for (int i = 97; i < 123; i++)
//        {
//            Character letter = (char) i;
//            classRoster.addItem(letter);
//        }
//
//        System.out.println(classRoster.pickItemDestructive());
//        System.out.println(classRoster.pickItemDestructive());
//        System.out.println(classRoster.pickItemDestructive());
//        System.out.println(classRoster.pickItemDestructive());
//        System.out.println(classRoster.pickItemDestructive());
//        classRoster.displayAllContents();

        Integer[] integers = {1, 6, 2, 8, 2, 9};
        GenericIntro.<Integer, Double>printArray(integers);
    }


    public static <T, E> void printArray(T[] arr)
    {
        System.out.print("{");
        for (T item : arr)
        {
            System.out.print(item + ", ");
        }
        System.out.print("}\n");
    }

    public static <T> void removeValue(Collection<T> stuff, T value)
    {
        if (stuff.contains(value))
        {
            stuff.remove(value);
        }
    }
}
