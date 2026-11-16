import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        System.out.println("hi");


        // Random r = new Random()

        // List<Integer> list = new ArrayList<>(Arrays.asList(
        //     2, 6, 5, 3, 8, 7, 1, 0
        // ));


        System.out.println("Starting merge sort");
        List<Integer> list2 = createRandom();
        list2 = mergeSort(list2);
        System.out.println("merge Sort completed ");


        List<Integer> list = createRandom();

        // System.out.println("Unsorted: " + list);
        System.out.println("Starting bubble sort");
        list = bubbleSort(list);
        System.out.println("Bubble Sorted: completed");
        


    }

    // O(n ^ 2)
    public static List<Integer> bubbleSort(List<Integer> list){
        List<Integer> copy = new ArrayList<>(list);



        // O(n * n)
        // O(n ^ 2)
        for(int i = 0; i < list.size(); i ++){

            // O(n) for a single pass
            for(int j = 0; j < list.size() - 1; j++){
                if(copy.get(j) > copy.get(j + 1)){
                    Collections.swap(copy, j, j + 1);
                }
            }

            // System.out.println("Intermediary list: " + copy);
        }

        return copy;
    }

    public static ArrayList<Integer> createRandom(){

        ArrayList<Integer> list = new ArrayList<>(100_000);

        Random rng = new Random();
        for(int i = 0; i < 100_000; i++){
            list.add(rng.nextInt(0, 100));
        }

        return list;

    }




    // O(n * logn)
    public static List<Integer> mergeSort(List<Integer> sortMe){

        if(sortMe.size() == 1){
            return sortMe;
        }

        int mid = sortMe.size() / 2;

        List<Integer> left = new ArrayList<>(sortMe.subList(0, mid));
        List<Integer> right = new ArrayList<>(sortMe.subList(mid, sortMe.size()));
    
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }









     // O(n) merge two sorted lists
    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0; 
        int j = 0; 

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
