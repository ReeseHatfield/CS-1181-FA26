import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        System.out.println("hi");


        // Random r = new Random()

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
            2, 6, 5, 3, 8, 7, 1, 0
        ));

        System.out.println("Unsorted: " + list);
        list = bubbleSort(list);
        System.out.println("Sorted: " + list);




    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
        ArrayList<Integer> copy = new ArrayList<>(list);



        // O(n * n)
        // O(n ^ 2)
        for(int i = 0; i < list.size(); i ++){

            // O(n) for a single pass
            for(int j = 0; j < list.size() - 1; j++){
                if(copy.get(j) > copy.get(j + 1)){
                    Collections.swap(copy, j, j + 1);
                }
            }

            System.out.println("Intermediary list: " + copy);
        }

        return copy;
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
