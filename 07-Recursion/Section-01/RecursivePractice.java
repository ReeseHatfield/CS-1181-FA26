public class RecursivePractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord("cat"));
        System.out.println(reverseWord("hello"));
        System.out.println(reverseWord(""));
        System.out.println(reverseWord("h"));
        System.out.println(reverseWord("abcdefghijklmnopqrstuvwxyz"));
    }

    public static String reverseWord(String word)
    {
        // base case - simplest version of the problem
        if (word.length() <= 1)
        {
            return word;
        }
        // recursive step - make the problem simpler, move towards the base case
        else
        {
            char lastCharacter = word.charAt(word.length() - 1);
            String shorterWord = word.substring(0, word.length() - 1);
            String reversedShorterWord = reverseWord(shorterWord);
            return lastCharacter + reversedShorterWord;
        }
    }
}
