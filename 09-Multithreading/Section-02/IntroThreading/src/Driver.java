public class Driver {
    public static void main(String[] args) throws InterruptedException {
        // Thread implements Runnable (class that uses an interface)
        // Runnable (interface)

        Runnable task = () -> {
            // for(int i = 0; i < 100; i ++){
            //     System.out.println(i);
            // }

            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}

            System.out.println("Finished executing runnable");

        };

        Thread t1 = new Thread(task);
        Thread t2 = new CustomThread();
        System.out.println("Starting threads..");

        t1.start();
        t2.start();

        // BLOCK MAIN UNTIL TARGET IS FINISHED
        t1.join();

        System.out.println("Finished main");


    }
}