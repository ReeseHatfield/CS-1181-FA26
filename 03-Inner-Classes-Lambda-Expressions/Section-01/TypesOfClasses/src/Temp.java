public class Temp implements Consumable {

    @Override
    public void consume(int timeDelay) {
        System.out.println(timeDelay);
    }
    
}
