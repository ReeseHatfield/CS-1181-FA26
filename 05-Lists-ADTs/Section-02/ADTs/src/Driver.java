import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        Stack<String> myStack = new Stack<>();
        myStack.push("Hello");
        myStack.push("My");
        myStack.push("Name");
        myStack.push("is");
        myStack.push("Reese");

        String top = myStack.peek();

        System.out.println(top);

        System.out.println(myStack.pop());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}