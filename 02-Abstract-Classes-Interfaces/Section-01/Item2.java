public abstract class Item2 implements Comparable<Item2>
{
    private double price = 0.0;
    private int quantity = 0;
    private String name = "";


    public Item2(double price, int quantity, String name)
    {
        setPrice(price);
        setQuantity(quantity);
        this.name = name;
    }

    public abstract double getPriceWithTax();

    @Override
    public int compareTo(Item2 otherItem)
    {
        if (this.price < otherItem.price)
        {
            return -1;
        }
        else if (this.price > otherItem.price)
        {
            return 1;
        }
        else
        {
            return 0;
        }
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
