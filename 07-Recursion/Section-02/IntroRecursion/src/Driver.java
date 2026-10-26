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

        for(int i = 0; i <= 3; i++){
            System.out.println(i);
        }
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