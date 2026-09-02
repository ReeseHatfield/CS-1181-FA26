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

    @Override
    public Item2 exchange(Item2 newItem)
    {
        if (newItem instanceof Clothing)
        {
            Clothing newClothingItem = (Clothing) newItem;
            Item2 oldItem = this;
            setPrice(newClothingItem.getPrice());
            setQuantity(newClothingItem.getQuantity());
            setName(newClothingItem.getName());
            setSize(newClothingItem.getSize());
            setColor(newClothingItem.getColor());
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
