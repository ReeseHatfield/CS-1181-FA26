public class CustomThread extends Thread {

    @Override 
    public void run(){
        // for(int i = 0; i < 100; i ++){
        //     System.out.println(i);

        // }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println("Finished CustomThread Class");
    }
}
