import java.util.ArrayList;

public class Laptop implements Gamable {
    private String brand;
    private double cpuSpeed;
    // ArrayList<Object> things;
    
    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }


    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public Laptop(String brand, double cpuSpeed){
        this.brand = brand;
        this.cpuSpeed = cpuSpeed;
    }


    public Laptop(Laptop other){
        this.brand = other.brand;
        this.cpuSpeed = other.cpuSpeed;
        // this.things = new ArrayList(other.things);
    }

    @Override
    public String toString(){
        return this.brand + " at " + this.cpuSpeed;
    }

    @Override
    public void playGame() {
        System.out.println("*plays game*");
    }

    public void foo(){

    }
}
