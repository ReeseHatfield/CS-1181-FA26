public class FirstThread extends Thread
{
    private int start = 0;
    private int max = 0;

    public FirstThread(int newStart, int newMax)
    {
        start = newStart;
        max = newMax;
    }

    @Override
    public void run()
    {
        for (int i = start; i < max; i++)
        {
            for (int j = 0; j < 100000; j++)
            {
                System.out.println(i + j);
            }
        }
    }
}
