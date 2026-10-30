import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        // doThing(0);

        // try {
        //     foo(4);
        // } catch(RuntimeException re){
        //     re.printStackTrace();
        // }


        // try {
        //     Scanner input = new Scanner(System.in);
    
        //     int i = input.nextInt();
    
        //     System.out.println(i);
        //     input.close();

        // } catch(Exception e){
        //     e.printStackTrace();
        // }

    //     for(int i = 0; i <= 3; i++){
    //         System.out.println(i);
    //     }

        // System.out.println(countOccurrences('l', "Hello"));
        // System.out.println(countOccurrences('o', "Hello"));
        // System.out.println(countOccurrences('H', "Hello"));
        // System.out.println(countOccurrences('j', "Hello"));

        
        System.out.println(OccuranceCounter.countOccurrences('l', "Hello"));
        System.out.println(OccuranceCounter.countOccurrences('o', "Hello"));
        System.out.println(OccuranceCounter.countOccurrences('H', "Hello"));
        System.out.println(OccuranceCounter.countOccurrences('j', "Hello"));

        System.out.println();
        System.out.println();
        
        
        // for(int i = 0; i < 50; i ++){
        //     System.out.println(fibonacci(i));
        // }
    }

    public static int fibonacci(int n){

        // if(n == 0 || n == 1){
        //     return 1;
        // }
        if(n == 0){
            return 1;
        }
        
        if(n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void doThing(int timesRan){
        // does a bunch a stuff
        // bunch of code


        // here
        // base case
        if(timesRan >= 3){
            // what do I do if the amount of times exceeds what I am looking for

            return;
        }

        // recursive step
        System.out.println(timesRan);
        doThing(timesRan + 1);

    }

    // public static int countOccurrences(char target, String s){
    //     if(s.equals("")){
    //         return 0;
    //     }


    //     int numCharactersFoundThisFrame = 0;

    //     char first = s.charAt(0);
    //     if(first == target) {
    //         numCharactersFoundThisFrame = 1;
    //     } else {
    //         numCharactersFoundThisFrame = 0;
    //     }

        
    //     return numCharactersFoundThisFrame 
    //         + countOccurrences(target, s.substring(1));
    // }

    // public static int countOccurrences(char target, String s){
    //     if(s.equals("")){
    //         return 0;
    //     }



    //     char first = s.charAt(0);
    //     if(first == target) {
    //         // 1
    //         return 1 + countOccurrences(target, s.substring(1));
    //     } else {
    //         // 0
    //         return countOccurrences(target, s.substring(1));
    //     }

        
    //     // return numCharactersFoundThisFrame 
    //     //     + countOccurrences(target, s.substring(1));
    // }



    public static void foo(int a){
        // int a = dynamic (4)
        
        bar();

    }


    public static void bar(){
        baz();
    }

    public static void baz(){
        throw new RuntimeException("something went wrong");
    }

}