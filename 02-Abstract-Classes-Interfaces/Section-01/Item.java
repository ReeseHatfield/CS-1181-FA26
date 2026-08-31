public class Item
{
    private double price = 0.0;
    private int quantity = 0;
    private String name = "";

    public Item (double price, int quantity, String name)
    {
        setPrice(price);
        setQuantity(quantity);
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        if (quantity >= 0)
        {
            this.quantity = quantity;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
