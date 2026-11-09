import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        // O(n)
        // O(n ^ 2)


        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i < 1_000_000; i++){
            list.add(i);
        }

        // System.out.println(list);

        // todo bug TAs about game jam

        // int index = linearSearch(list, 17);

        System.out.println("Running binary search");
        int index = binarySearch(list, 999_990, 0, list.size() - 1);
        System.out.println("index was: " + index);
        System.out.println("Finished binary search");
        
        System.out.println("Running linear search");
        index = linearSearch(list, 999_990);
        System.out.println("index was: " + index);
        System.out.println("Finished linear search");

        
    }

    // O(logN)
    public static int binarySearch(ArrayList<Integer> list, int target, int left, int right){
        System.out.println("Binary search was called");
        int mid = (left + right) / 2;
        // System.out.println("left was" + left);
        // System.out.println("right was" + right);
        // System.out.println();

        if(left > right){
            return -1;
        }

        if(list.get(mid) == target){
            return mid;
        }

        if(list.get(mid) > target) {
            return binarySearch(list, target, left, mid - 1);
        }
        else {
            return binarySearch(list, target, mid + 1, right);
        }

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
            System.out.println("Linear was called");

            if(curVal == target){
                return curIndex;
            }
        }

        return -1;

    }
}