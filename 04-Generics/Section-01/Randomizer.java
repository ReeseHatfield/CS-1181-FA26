import java.util.*;

public class Randomizer<E extends Comparable<E>> implements Comparable<Randomizer<E>>
{
    private ArrayList<E> contents = new ArrayList<>();
    private Random rng = new Random();

    public Randomizer()
    {

    }

    public Randomizer(ArrayList<E> items)
    {
//        for (E item : items)
//        {
//            contents.add(item);
//        }
        // shallow copies items
        // can't easily get around this with generics
        // no guarantee of a copy constructor, no-arg constructor, clone(), etc.
        contents.addAll(items);
    }

    public void addItem(E item)
    {
        contents.add(item);
    }

    public E pickItem()
    {
        int randomIndex = rng.nextInt(contents.size());
        return contents.get(randomIndex);
    }

    public E pickItemDestructive()
    {
        int randomIndex = rng.nextInt(contents.size());
        return contents.remove(randomIndex);
    }

    public void displayAllContents()
    {
        Collections.sort(contents);
        System.out.println(contents);
    }

    @Override
    public int compareTo(Randomizer<E> o)
    {
        return 0;
    }
}
