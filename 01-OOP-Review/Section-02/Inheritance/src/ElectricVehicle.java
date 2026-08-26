public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String name){
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("*silent*");
    }
    
}
