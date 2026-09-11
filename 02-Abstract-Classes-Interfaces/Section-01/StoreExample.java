import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StoreExample
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer();
        Customer c2 = new Customer("Clarissa", 153.86);

        System.out.println(c2);

        c1.setBudget(-73);
        System.out.println(c1.getBudget());

        // Item2 item = new Item2(4.5, 3, "coffee");

        Clothing purchasedItem = new Clothing(45.35, 15, "Pants", 'M', "Blue");
        System.out.println(purchasedItem);

        Clothing newItem = new Clothing(28.48, 10, "Shirt", 'L', "Red");
        System.out.println(newItem);

        System.out.println("Exchanging " + purchasedItem + " for " + newItem);
        Item2 returnedItem = purchasedItem.exchange(newItem);

        System.out.println("Returned " + returnedItem);
        System.out.println("Customer purchased " + purchasedItem);

        // Item2 returnedItem2 = purchasedItem.exchange(foodItem);

        Food foodItem = new Food(1.87, 234, "Candy", false, 1800);
        System.out.println(foodItem);

        Food foodItem2 = new Food(1.87, 45, "Banana", false, 90);

        ArrayList<Item2> shoppingCart = new ArrayList<>();
        shoppingCart.add(purchasedItem);
        shoppingCart.add(returnedItem);
        shoppingCart.add(foodItem);
        shoppingCart.add(foodItem2);

        System.out.println(shoppingCart);
        Collections.sort(shoppingCart);
        System.out.println(shoppingCart);

        Collections.sort(shoppingCart, new Item2Comparator());
        System.out.println(shoppingCart);

        Clothing socks = new Clothing(4.50, 100, "socks", 's', "white");
        ArrayList<Clothing> clothes = new ArrayList<>(Arrays.asList(purchasedItem, (Clothing) returnedItem, socks));

        System.out.println(clothes);
        Collections.sort(clothes);
        System.out.println(clothes);
        Collections.sort(clothes, new Clothing.ClothingComparator());
        System.out.println(clothes);

        Food food3 = new Food(16.89, 19, "pizza", true, 560);
        ArrayList<Food> foods = new ArrayList<>(Arrays.asList(foodItem, foodItem2, food3));
        System.out.println(foods);
        Collections.sort(foods);
        System.out.println(foods);
        Collections.sort(foods, new Comparator<Food>(){
            @Override
            public int compare(Food f1, Food f2) {
                return Integer.compare(f1.getCalories(), f2.getCalories());
            }
        });
        System.out.println(foods);
        System.out.println(shoppingCart);
        Collections.sort(shoppingCart, (i1, i2) -> Double.compare(i2.getPriceWithTax(), i1.getPriceWithTax()));
        System.out.println(shoppingCart);
    }
}
