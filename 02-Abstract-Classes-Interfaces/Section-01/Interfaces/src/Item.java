public class Item implements Purchasable {

    @Override
    public Purchasable puchase(int cost) {
    
        return this;
    }

    @Override
    public int sell() {
        return 0;
    }
    
}
