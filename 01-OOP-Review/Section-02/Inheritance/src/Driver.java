public class Driver {
    public static void main(String[] args){
        // Vehicle v = new Vehicle("f150");


        Vehicle v2 = new ElectricVehicle("tesla");
        v2.drive();

        // v.drive(10);
        // v.drive(15);

        Car c = new Car("elantra");
        c.drive();


        Truck t = new Truck("f150");
        t.drive();


        // declared vs. actual type
        // compile time type vs runtime type
        // Vehicle v = new Car();

        foo(c);
        foo(t);
        foo(new ElectricVehicle("byd"));

        Truck t2 = new Truck("silverado");
        t2.loadCargo("Wood");
        t2.loadCargo("Steel");
    }

    // v is variable who's declared type is a vehicle
    // actual type -> becomes whatever you pass in the value as
    public static void foo(Vehicle v){
        // dynamic dispatch
        v.drive();

    }

}