public class StoreExample
{
    public static void main(String[] args)
    {
        Customer c1 = new Customer();
        Customer c2 = new Customer("Clarissa", 153.86);

        System.out.println(c2);

        c1.setBudget(-73);
        System.out.println(c1.getBudget());
    }
}
