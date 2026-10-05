import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ChatBot cb = new ChatBot("RnJ.txt");
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print(">>>");
            String input = keyboard.nextLine();

            String response = cb.reply(input);

            delayPrint(response);
        }
    
        // keyboard.close();
    }

    public static void delayPrint(String s){

        for(char c: s.toCharArray()){
            try {
                Thread.sleep(20);
                System.out.print(c);
            } catch (InterruptedException e) {}
        }
    }
}