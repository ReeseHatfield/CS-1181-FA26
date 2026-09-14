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
    }
}
