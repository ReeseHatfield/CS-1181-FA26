public class LinkedListTesting
{
    public static void main(String[] args)
    {
        CustomLinkedList<String> names = new CustomLinkedList<>();
        names.add("Clarissa");
        names.add("Tim");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        names.replace(1, "bob");
        System.out.println(names.get(1));
        System.out.println(names);
        System.out.println(names.get(2));
    }
}
