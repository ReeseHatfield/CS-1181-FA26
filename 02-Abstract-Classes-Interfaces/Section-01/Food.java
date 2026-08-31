public class Food extends Item
{
    private boolean needsRefrigerated = false;
    private int calories = 0;

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
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
