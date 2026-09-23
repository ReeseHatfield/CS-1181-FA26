import java.util.ArrayList;
import java.util.LinkedList;

public class Driver {
    public static void main(String[] args){

        Node<String> first = new Node<>("Hello");
        Node<String> second = new Node<>("my");
        Node<String> third = new Node<>("name");
        Node<String> fourth = new Node<>("is");
        Node<String> fifth = new Node<>("Reese");

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;



        /// wayyyy later on
        /// 
        /// 


        // first
        // int i = 0; i < 10; i ++
        // declare a value that are going to change
        // we never used second, third, ...
        // only access the head to start
        Node<String> cur = first;
        while(cur != null){

            System.out.println(cur.data);
            cur = cur.next;
        }


        System.out.println();


        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("Hello");
        myList.add("my");
        myList.add("name");
        myList.add("is");
        myList.add("Reese");
        System.out.println(myList);


    }


}