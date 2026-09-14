import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Integer i = new Integer(5);


        // CustomArrayList cal = new CustomArrayList();

        // Integer s = (int) cal.get(0);


        ArrayList<Integer> l = new ArrayList<>();


        // l.get(i);

        Box<String> b1 = new Box<>("Hello");
        Box<Integer> b2 = new Box<>(4);
        Box<Double> b3 = new Box<Double>(4.3);

        String s1 = b1.getData();
        System.out.println(s1);
        System.out.println(b2.getData());
        System.out.println(b3);

        Pair<String, Integer> pair1 = new Pair<String,Integer>("world", 0);
        // Pair<String, Integer> pair1 = new Pair<String,Integer>(0, "world");

        Box<ArrayList<String>> b4 = new Box<>(new ArrayList<>());
        b4.getData().add("My");
        b4.getData().add("Name");
        b4.getData().add("Is");
        b4.getData().add("Reese");

        System.out.println(b4);
        System.out.println(b4.getData());

        Box<Box<Pair<Integer, Double>>> b5 = new Box<>(new Box<>(new Pair<>(5, 6.5)));
        System.out.println(b5);

    }

}