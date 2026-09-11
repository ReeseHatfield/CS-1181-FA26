import java.util.Comparator;

public class Item2Comparator implements Comparator<Item2>
{
    @Override
    public int compare(Item2 o1, Item2 o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}
