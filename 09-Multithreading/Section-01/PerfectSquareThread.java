import java.util.ArrayList;
import java.util.List;

public class PerfectSquareThread extends Thread
{
    private int start = 0;
    private int end = 0;
    private List<Integer> threadSearchSpace = new ArrayList<>();



    public PerfectSquareThread(int newStart, int newEnd, ArrayList<Integer> entireSearchSpace)
    {
        start = newStart;
        end = newEnd;
        threadSearchSpace = new ArrayList<>(entireSearchSpace.subList(start, end));
    }

    @Override
    public void run()
    {
        for (int num : threadSearchSpace)
        {
            if (isPerfectSquare(num))
            {
                //System.out.println("PERFECT SQUARE: " + num);
                addPerfectSquare(num);
            }
        }
    }

    public synchronized void addPerfectSquare(int newPerfectSquare)
    {
        ThreadIntro.perfectSquares.add(newPerfectSquare);
    }

    public boolean isPerfectSquare(int num)
    {
        int perfectSquare = 1;
        int square = 2;

        while (perfectSquare < num)
        {
            perfectSquare = square * square;
            square++;
        }
        return perfectSquare == num;
    }

//    public static ArrayList<Integer> getPerfectSquares()
//    {
//        return ThreadIntro.perfectSquares;
//    }

}
