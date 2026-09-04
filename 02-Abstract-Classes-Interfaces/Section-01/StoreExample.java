import java.util.ArrayList;
import java.util.Collections;

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

        Food foodItem = new Food(1.87, 234, "Candy", false, 180);
        System.out.println(foodItem);

        ArrayList<Item2> shoppingCart = new ArrayList<>();
        shoppingCart.add(purchasedItem);
        shoppingCart.add(returnedItem);
        shoppingCart.add(foodItem);

        System.out.println(shoppingCart);
        Collections.sort(shoppingCart);
        System.out.println(shoppingCart);

        // Item2 returnedItem2 = purchasedItem.exchange(foodItem);
    }
}
