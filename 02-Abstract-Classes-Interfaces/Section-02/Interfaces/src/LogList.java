import java.util.ArrayList;

// public class LogList extends ArrayList<String> {
public class LogList {
    
    private ArrayList<String> list = new ArrayList<>();

    public void addLog(String log){
        list.add(log);
    }

    public void printEveryOther(){
        for(int i = 0; i < this.list.size(); i += 2){
            System.out.println(this.list.get(i));
        }
    }
}
