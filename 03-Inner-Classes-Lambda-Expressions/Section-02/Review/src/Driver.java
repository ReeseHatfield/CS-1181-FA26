public class Driver {
    public static void main(String[] args) {
        System.out.println("hi");

        Laptop hp = new Laptop("HP", 2.5);
        // much later

        // shallow copy = just an assignment
        // deep copy uses the new keyword
        Laptop fasterHP = new Laptop(hp);
        fasterHP.setCpuSpeed(3.0);

        System.out.println(fasterHP);
        System.out.println(hp);

        // [declared type] [var name] = [actual] 
        Gamable g = new Laptop("Razor", 4.2);
        g.playGame();

        System.out.println();
        System.out.println();
        System.out.println();

        performAction(new Laptop(hp));
        performAction(new Console());
        performAction(() -> {
            System.out.println("Called from lambda");
        });

    }

    public static void performAction(Gamable g){

        // dynamically look up the implementation at runtime
        g.playGame();

    }
}