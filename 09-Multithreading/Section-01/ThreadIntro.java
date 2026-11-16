public class ThreadIntro
{
    public static void main(String[] args)
    {
        Thread t1 = new FirstThread(1, 1000);
        t1.start();

//        for (int i = 0; i < 100000; i++)
//        {
//            for (int j = 0; j < 100000; j++)
//            {
//                System.out.println("MAIN THREAD");
//            }
//        }
    }
}
