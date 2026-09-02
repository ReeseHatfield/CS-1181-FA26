public class Food extends Item2
{
    private boolean needsRefrigerated = false;
    private int calories = 0;

    public Food(double price, int quantity, String name, boolean needsRefrigerated, int calories)
    {
        super(price, quantity, name);
        this.needsRefrigerated = needsRefrigerated;
        setCalories(calories);
    }

    @Override
    public double getPriceWithTax()
    {
        return getPrice();
    }

    public String toString()
    {
        return getName() + " (food item) needsRefrigerated: " + needsRefrigerated + " calories: " + calories + " price w/ tax: $" + String.format("%.2f", getPriceWithTax());
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        if (calories >= 0)
        {
            this.calories = calories;
        }
    }

    public boolean isNeedsRefrigerated()
    {
        return needsRefrigerated;
    }

    public void setNeedsRefrigerated(boolean needsRefrigerated)
    {
        this.needsRefrigerated = needsRefrigerated;
    }
}
