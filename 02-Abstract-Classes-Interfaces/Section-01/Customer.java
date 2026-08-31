public class Customer
{
    private double budget = 0.0;
    private String name = "";

    public Customer()
    {
        budget = 0.0;
        name = "bob";
    }

    public Customer(String name, double budget)
    {
        this.name = name;
        setBudget(budget);
    }

    @Override
    public String toString()
    {
        return "Customer " + name + " has a budget of $" + budget;
    }

    public double getBudget()
    {
        return budget;
    }

    public boolean setBudget(double newBudget)
    {
        if (newBudget >= 0)
        {
            this.budget = newBudget;
            return true;
        }
        else
        {
            return false;
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
