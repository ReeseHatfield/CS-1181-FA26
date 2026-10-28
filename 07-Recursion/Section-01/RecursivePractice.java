import java.util.Random;

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
}
