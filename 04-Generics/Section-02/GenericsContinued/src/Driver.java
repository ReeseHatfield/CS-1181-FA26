import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
        ArrayList<Box<Integer>> list = new ArrayList<>();
        list.add(new Box<Integer>(5));
        list.add(new Box<Integer>(1));
        list.add(new Box<Integer>(3));
        list.add(new Box<Integer>(9));
        list.add(new Box<Integer>(0));

        System.out.println(list);

        list.add(new Box<Integer>(5));
        // Box<String> b2 = new Box<String>("hello");

        // Integer

        Box<Student> b2 = new Box<>(new Student(4));
        // Box<NonCompType> b3 = new Box<NonCompType>(new NonCompType());

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Student> newList = new ArrayList<>();
        newList.add(new Student(4));
        newList.add(new Student(1));
        newList.add(new Student(0));
        newList.add(new Student(5));
        newList.add(new Student(3));
        Collections.sort(newList);

        System.out.println(newList);

        // int n = foo(4);

        // List<? extends Number> wildList = new ArrayList<>();
        List<? super Number> wildList = new ArrayList<>();
        wildList.add(5);
        wildList.add(1);
        wildList.add(2);

        Object o = wildList.get(1);

        ArrayList<Box<?>> boxList = new ArrayList<>();

        boxList.add(new Box<Integer>(4));
        boxList.add(new Box<String>("hello"));


        int[] arr = new int[5];
        arr[0] = 7;
        // arr[8] = 6;


        int i = 6;
        int j = 9;


        ArrayList<String> strList = new ArrayList<>(5);
        strList.add("hello");
        strList.add("hello");
        strList.add("hello");
        strList.add("hello");
        strList.add("hello");
        strList.add("hello");

        

        
    }

    public static <G extends Number> G foo(G thing){

        return thing;
    }
}
