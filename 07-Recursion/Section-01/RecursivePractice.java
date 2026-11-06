import java.util.*;

public class RecursivePractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord("cat"));
        System.out.println(reverseWord("hello"));
        System.out.println(reverseWord(""));
        System.out.println(reverseWord("h"));
        System.out.println(reverseWord("abcdefghijklmnopqrstuvwxyz"));

        System.out.println(countEven(""));
        System.out.println(countEven("324568"));
        System.out.println(countEven("22"));
        System.out.println(countEven("0"));

        System.out.println(scrambleWord("cat"));
        System.out.println(scrambleWord("hello"));
        System.out.println(scrambleWord(""));
        System.out.println(scrambleWord("h"));
        System.out.println(scrambleWord("abcdefghijklmnopqrstuvwxyz"));

        System.out.println(permute(""));
        System.out.println(permute("ab"));
        System.out.println(permute("cat"));
        System.out.println(permute("four"));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 6, 2, 8, 3, 4, 5, 1, 2, 9, 8, 5, 6, 3, 1, 8, 9, 9, 4, 3, 6, 7, 2, 4));
        Collections.sort(numbers);
    }

    public static String scrambleWord(String word)
    {
        // base case - simplest version of the problem
        if (word.length() <= 1)
        {
            return word;
        }
        // recursive step - make the problem simpler, move towards the base case
        Random rng = new Random();
        int ranIndex = rng.nextInt(0, word.length());
        char ranCharacter = word.charAt(ranIndex);
        String shorterWord = word.substring(0, ranIndex) + word.substring(ranIndex + 1);
        return ranCharacter + scrambleWord(shorterWord);
    }

    public static int countEven(String number)
    {
        if (number.isEmpty())
        {
            return 0;
        }
        int firstNum = Integer.parseInt(number.substring(0, 1));
        String shorter = number.substring(1);
        return isEven(firstNum) + countEven(shorter);
    }

    public static int isEven(int num)
    {
        if (num % 2 == 0)
        {
            return 1;
        }
        return 0;
    }

    public static String reverseWord(String word)
    {
        // base case - simplest version of the problem
        if (word.length() <= 1)
        {
            return word;
        }
        // recursive step - make the problem simpler, move towards the base case
        return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
//        else
//        {
//            char lastCharacter = word.charAt(word.length() - 1);
//            String shorterWord = word.substring(0, word.length() - 1);
//            String reversedShorterWord = reverseWord(shorterWord);
//            return lastCharacter + reversedShorterWord;
//        }
    }


    public static ArrayList<String> permute(String word)
    {
        ArrayList<String> permuteList = new ArrayList<>();

        // edge case check
        if (word.isEmpty())
        {
            return permuteList;
        }
        // base case
        else if (word.length() == 1)
        {
            permuteList.add(word);
            return permuteList;
        }

        for (int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);
            String remainingWord = word.substring(0, i) + word.substring(i + 1);
            ArrayList<String> result = permute(remainingWord);
            for (String permutation : result)
            {
                permuteList.add(letter + permutation);
            }
        }
        return permuteList;
    }

    public static <V extends Comparable<V>> int binarySearch(List<V> list, V value)
    {
        // base case
        if (list.isEmpty())
        {
            return -1;
        }

        // recursive step
        int midIndex = list.size() / 2;

        if (value.compareTo(list.get(midIndex)) > 0)
        {
            list = list.subList(midIndex + 1, list.size());
            int index = binarySearch(list, value);
            if (index == -1)
            {
                return index;
            }
            else
            {
                return index + midIndex;
            }
        }
        // DELETE LATER
        return 0;
    }
}
