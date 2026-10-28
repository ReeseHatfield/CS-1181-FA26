public class OccuranceCounter {
    
    public static int countOccurrences(char target, String s){
        return countOccurrences(target, s, 0);
    }

    private static int countOccurrences(char target, String s, int foundSoFar){
        // System.out.println(s);
        // System.out.println(foundSoFar);
        // System.out.println();

        if(s.equals("")){
            // return 0;
            return foundSoFar;
        }

        char first = s.charAt(0);
        if(first == target) {
            // 1
            return countOccurrences(target, s.substring(1), foundSoFar + 1);
        } else {
            // 0
            return countOccurrences(target, s.substring(1), foundSoFar);
        }
    }
}
