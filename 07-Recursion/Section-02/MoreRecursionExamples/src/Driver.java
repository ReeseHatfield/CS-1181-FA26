public class Driver {
    public static void main(String[] args){
        System.out.println("Ahoy!");


        System.out.println(removeX("xhellox"));
        System.out.println(removeX("xx__javadev__xx"));
        System.out.println(removeX("xx__java__x__dev__xx"));
        System.out.println(removeChar("xx__java__x__dev__xx", 'v'));
        System.out.println();

        System.out.println(endX("xx_java_dev__xx"));
        System.out.println(endX("hellxxxoooo"));

        // printTriangleAlt(5);
        // printTriangleAlt(15);

        // printInvertedTriangle(15, 1);

        System.out.println();
        System.out.println("IsPalindrome Testing:");
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("heeh"));
        System.out.println(isPalindrome("heujueh"));

    }

    public static boolean isPalindrome(String input){
        if(input.length() <= 1){
            return true;
        }

        char first = input.charAt(0);
        char last  = input.charAt(input.length() - 1);

        if(first != last){
            return false;
        }

        String remaining = input.substring(1, input.length() - 1);

        return isPalindrome(remaining);

    }


    public static void printTriangle(int height){
        if(height == 1){
            System.out.println("* ");
            return;
        }

        for(int i = 0; i < height; i++){
            System.out.print("* ");
        }
        System.out.println();

        printTriangle(height - 1);
    }

    public static void printTriangleAlt(int height){

        if(height == 0){
            return;
        }

        for(int i = 0; i < height; i++){
            System.out.print("* ");
        }
        System.out.println();

        printTriangleAlt(height - 1);
    }

    public static void printInvertedTriangle(int targetHeight, int curHeight){
        if(curHeight == targetHeight + 1){
            return;
        }

        for(int i = 0; i < curHeight; i++){
            System.out.print("* ");
        }
        System.out.println();


        printInvertedTriangle(targetHeight, curHeight + 1);

    }

    public static void printRow(int lengthRemaining){
        if(lengthRemaining == 0){
            System.out.println();
            return;
        }


        System.out.print("* ");
        printRow(lengthRemaining - 1);
    }

    public static void printInvertedTriangleAlt(int targetHeight, int curHeight){
        if(curHeight == targetHeight + 1){
            return;
        }

        printRow(curHeight);

        printInvertedTriangle(targetHeight, curHeight + 1);

    }


    /**
     * Returns a string with all the x's at the ends
     * @param input
     * @return moved x's
     */
    public static String endX(String input){

        if(input.equals("")){
            return "";
        }

        char first = input.charAt(0);
        String remaining = input.substring(1);

        if(first == 'x'){
            return (endX(remaining) + first);
        } else {
            return (first + endX(remaining));
        }

    }

    public static String removeX(String input){
        // base case
        if(input.equals("")) {
            // return "";
            return input;
        }

        char first = input.charAt(0);
        String remaining = input.substring(1);

        if(first == 'x'){
            return removeX(remaining);
        }
        else {
           return first + removeX(remaining);
        }

    }



    public static String removeChar(String input, char toRemove){
        // System.out.println("called removeChar");
        // System.out.println("Input was: " + input);
        // System.out.println("toRemove was: " + toRemove);
        // System.out.println();
        
        // base case
        if(input.equals("")) {
            // return "";
            return input;
        }

        char first = input.charAt(0);
        String remaining = input.substring(1);

        if(first == toRemove){
            return removeChar(remaining, toRemove);
        }
        else {
           return first + removeChar(remaining, toRemove);
        }

    }
}