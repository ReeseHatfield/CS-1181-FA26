import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ChatBot {

    private HashMap<String, ArrayList<String>> map;

    public ChatBot(String path){
        File f = new File(path);
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(f);
            String line = fileScanner.nextLine();

            this.map = buildMap(line);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // System.out.println(map);


    }

    private HashMap<String, ArrayList<String>> buildMap(String s){
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        String[] wordsInOrder = s.split(" ");

        for(int i = 0; i < wordsInOrder.length - 1; i++){
            String curWord = wordsInOrder[i];
            String nextWord = wordsInOrder[i + 1];

            if(!map.containsKey(curWord)){
                ArrayList<String> list = new ArrayList<>();
                list.add(nextWord);

                map.put(curWord, list);
            }
            else {
                map.get(curWord).add(nextWord);
            }
        }

        return map;

    }

    public String reply(String input){
        String[] parts = input.split(" ");

        int wordsInReply = 20;
        String lastWord = parts[parts.length - 1];
        Random rng = new Random();

        String reply = "";
        for(int i = 0; i < wordsInReply; i++){
            ArrayList<String> options = this.map.get(lastWord);
            String newWord = options.get(rng.nextInt(options.size()));
            reply += newWord + " ";

            lastWord = newWord;
        }

        return reply;
    }
}
