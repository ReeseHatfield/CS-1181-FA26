import java.util.ArrayList;

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

        Randomizer<Integer> lotteryDraw = new Randomizer<>();

        for (int i = 1; i <= 100; i++)
        {
            lotteryDraw.addItem(i);
        }

        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        System.out.println(lotteryDraw.pickItem());
        lotteryDraw.displayAllContents();


        Randomizer<Character> classRoster = new Randomizer<>();

        for (int i = 97; i < 123; i++)
        {
            Character letter = (char) i;
            classRoster.addItem(letter);
        }

        System.out.println(classRoster.pickItemDestructive());
        System.out.println(classRoster.pickItemDestructive());
        System.out.println(classRoster.pickItemDestructive());
        System.out.println(classRoster.pickItemDestructive());
        System.out.println(classRoster.pickItemDestructive());
        classRoster.displayAllContents();
    }
}
