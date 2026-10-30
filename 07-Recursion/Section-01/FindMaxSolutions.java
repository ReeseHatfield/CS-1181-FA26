import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxSolutions
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "class", "apple", "bee", "zoo", "kind", "fall"));
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 8, 3, 4, 0, 10, 4, -4, 7));

        System.out.println(maxOfArray(words));
        System.out.println(maxOfArray(nums));

        words = new ArrayList<>(Arrays.asList("hello", "world", "class", "apple", "bee", "zoo", "kind", "fall"));
        nums = new ArrayList<>(Arrays.asList(3, 5, 8, 3, 4, 0, 10, 4, -4, 7));

        System.out.println(max(words));
        System.out.println(max(nums));

        words = new ArrayList<>(Arrays.asList("hello", "world", "class", "apple", "bee", "zoo", "kind", "fall"));
        nums = new ArrayList<>(Arrays.asList(3, 5, 8, 3, 4, 0, 10, 4, -4, 7));

        System.out.println(maxValue(words, null));
        System.out.println(maxValue(nums, null));

        words = new ArrayList<>(Arrays.asList("hello", "world", "class", "apple", "bee", "zoo", "kind", "fall"));
        nums = new ArrayList<>(Arrays.asList(3, 5, 8, 3, 4, 0, 10, 4, -4, 7));

        System.out.println(greatest(words));
        System.out.println(greatest(nums));
    }

    // table 2
    public static <E extends Comparable<E>> E maxOfArray(ArrayList<E> list)
    {
        if (list.isEmpty())
        {
            return null;
        }
        if (list.size() == 1)
        {
            return list.getFirst();
        }
        E first = list.removeFirst();
        E otherOne = maxOfArray(list);
        if (first.compareTo(otherOne) >= 0)
        {
            return first;
        }
        else
        {
            return otherOne;
        }
    }

    // table 3
    public static <E extends Comparable<E>> E max(ArrayList<E> list)
    {
        if (list.isEmpty())
        {
            return null;
        }
        if (list.size() == 1)
        {
            return list.getFirst();
        }
        if (list.get(0).compareTo(list.get(1)) > 0)
        {
            list.remove(1);
        }
        else
        {
            list.remove(0);
        }
        return max(list);
    }

    // table 4
    public static <E extends Comparable<E>> E maxValue(ArrayList<E> list, E returnVal)
    {
        if (list.isEmpty())
        {
            return returnVal;
        }
        if (returnVal == null)
        {
            returnVal = list.removeFirst();
            return maxValue(list, returnVal);
        }
        else
        {
            E nextVal = list.removeFirst();
            int compareVal = returnVal.compareTo(nextVal);
            if (compareVal < 0)
            {
                returnVal = nextVal;

            }
            return maxValue(list, returnVal);
        }
    }

    // table 6
    public static <T extends Comparable<T>> T greatest(ArrayList<T> list)
    {
        T temp;
        T max;
        if (list.size() == 1)
        {
            max = list.getFirst();
            return max;
        }
        else if (list.isEmpty())
        {
            return null;
        }
        temp = list.removeLast();
        max = greatest(list);

        if (temp.compareTo(max) > 0)
        {
            max = temp;
        }
        return max;
    }
}
