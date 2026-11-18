import java.util.ArrayList;
import java.util.Random;

public class ThreadIntro
{
    // 1 thread took 55492ms
    // 2 threads took 17726ms
    // 3 threads took 12047ms
    // 4 threads took 9386ms
    // 8 threads took 5345
    public static final int NUM_THREADS = 100;

    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<Integer> searchSpace = new ArrayList<>();
        Random rng = new Random(5);
        for (int i = 0; i < 9999999; i++)
        {
            searchSpace.add(rng.nextInt(100000000));
        }
        System.out.println("List created!");

        long startTime = System.currentTimeMillis();

        Thread[] workers = new Thread[NUM_THREADS];
        int blockSize = searchSpace.size() / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++)
        {
            int start = i * blockSize;
            int end = (i + 1) * blockSize;

            // make sure the last thread grabs the remainder values
            if (i == NUM_THREADS - 1)
            {
                end = searchSpace.size();
            }

            workers[i] = new PerfectSquareThread(start, end, searchSpace);
            System.out.println("CREATED THREAD #" + i);
            workers[i].start();
        }

        for (Thread t : workers)
        {
            t.join();
        }

        long end = System.currentTimeMillis();

        System.out.println("TOTAL TIME: " + (end - startTime));

//        for (int i = 0; i < 100000; i++)
//        {
//            for (int j = 0; j < 100000; j++)
//            {
//                System.out.println("MAIN THREAD");
//            }
//        }
    }
}
