public class Clothing extends Item
{
    private char size = 'M';
    private String color = "";

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
