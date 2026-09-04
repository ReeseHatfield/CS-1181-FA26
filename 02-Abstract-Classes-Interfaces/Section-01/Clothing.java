public class Clothing extends Item2 implements Exchangeable
{
    private char size = 'M';
    private String color = "";

    public Clothing(double price, int quantity, String name, char size, String color)
    {
        super(price, quantity, name);
        this.size = size;
        this.color = color;
    }

    public Clothing(Clothing newClothing)
    {
        super(newClothing.getPrice(), newClothing.getQuantity(), newClothing.getName());
        this.size = newClothing.getSize();
        this.color = newClothing.getColor();
    }

    @Override
    public Item2 exchange(Item2 newItem)
    {
        if (newItem instanceof Clothing)
        {
            // Casting from Item2 to Clothing
            Clothing newClothingItem = (Clothing) newItem;

            // SHALLOW COPY
            // Item2 oldItem = this;

            // DEEP COPY
            Item2 oldItem = new Clothing(this);

            this.setPrice(newClothingItem.getPrice());
            this.setQuantity(newClothingItem.getQuantity());
            this.setName(newClothingItem.getName());
            this.setSize(newClothingItem.getSize());
            this.setColor(newClothingItem.getColor());
            return oldItem;
        }
        else
        {
            throw new NotExchangeableException("Clothing");
        }
    }

    @Override
    public double getPriceWithTax()
    {
        return super.getPrice() * 1.07;
    }

    @Override
    public String toString()
    {
        return getName() + " (clothing item) size: " + size + " color: " + color + " price w/ tax: $" + String.format("%.2f", getPriceWithTax());
    }

    public char getSize()
    {
        return size;
    }

    public void setSize(char size)
    {
        this.size = size;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
