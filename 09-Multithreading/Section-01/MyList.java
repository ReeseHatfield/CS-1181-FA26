import java.util.ArrayList;

public class MyList <T> extends ArrayList<T> implements Runnable
{
    @Override
    public void run()
    {
        for (T item : this)
        {
            System.out.println(item);
        }
    }
}
