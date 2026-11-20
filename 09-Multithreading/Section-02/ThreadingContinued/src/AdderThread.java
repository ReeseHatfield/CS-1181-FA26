public class AdderThread extends Thread {

    private int start;
    private int end;
    private int id;

    private int total;

    

    /**
     * call join before calling me
     * @return total
     */
    public int getTotal() {
        return total;
    }


    public AdderThread(int id ,int start, int end){
        this.id = id;

        this.start = start;
        this.end = end;

    }


    @Override 
    public void run(){

        System.out.println("Thread " + id + " was given: " + this.start + "-" + this.end);

        int sumOnThread = 0;
        for(int i = start; i < end; i++){
            sumOnThread += add(sumOnThread, i);
        }

        this.total = sumOnThread;


    }

    public static int add(int a, int b){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        return a + b;
    }
}
