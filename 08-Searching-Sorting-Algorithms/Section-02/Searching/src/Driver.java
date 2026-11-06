import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        // O(n)
        // O(n ^ 2)


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
            12, 0, 5, 2, 6
        ));

        System.out.println(list);

        // todo bug TAs about game jam

        int index = randomSearch(list, 19);
        System.out.println("index was: " + index);

        
    }

    public static int randomSearch(ArrayList<Integer> list, int target){

        Random rng = new Random();
        int foundIndex = -1;
        while(true){
            int curIndex = rng.nextInt(list.size());
            int curVal = list.get(curIndex);

            if(curVal == target){
                // return curIndex;
                foundIndex = curIndex;
                break;
            }            

        }

        return foundIndex;
    }


    public static int linearSearch(ArrayList<Integer> list, int target){
        // call list.size() = N

        //  declaration 1
        // return 1
        // operations per loop = 5

        // 2 + 5 (5)
        // 2 + 5 (100)
        // 2 + 5 (1_000_000)
        // 5 (N)
        // O(N)

        for(int i = 0; i < list.size(); i++){
            Integer curIndex = i;
            Integer curVal = list.get(i);

            if(curVal == target){
                return curIndex;
            }
        }

        return -1;

    }
}