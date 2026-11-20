import java.util.ArrayList;

public class Driver {

    

    public static void main(String[] args) throws InterruptedException { 


        // 0 - 50
        int max = 50;

        // speedup when increasing threads is what we look for
        int numThreads = 10;

        ArrayList<AdderThread> threads = new ArrayList<>();
        for(int i = 0; i < numThreads; i++){

            int chunkSize = max / numThreads;

            int curStart = chunkSize * i;
            int curEnd = curStart + chunkSize;

            if(i == numThreads - 1) {
                curEnd = max;
            }


            AdderThread cur = new AdderThread(i, curStart, curEnd);

            threads.add(cur);
        }

        for(int i = 0; i < numThreads; i++){
            threads.get(i).start();
        }
        
        for(int i = 0; i < numThreads; i ++){
            threads.get(i).join();
        }


        int finalTotal = 0;
        for(int i = 0; i < numThreads; i++){
            finalTotal += threads.get(i).getTotal();
        }


        System.out.println("Final total was: " + finalTotal);






    }
}


// Thread worker = new Thread(() -> {
//             long count = 0;
//             while (!stop) {
//                 count++;
//             }
//             System.out.println("Worker stopped at count: " + count);
//         });

//         worker.start();

//         Thread.sleep(100); 

//         System.out.println("Main thread setting stop = true...");
//         stop = true;