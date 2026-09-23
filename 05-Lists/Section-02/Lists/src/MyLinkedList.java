public class MyLinkedList<T> {

    private Node<T> head = null;

    public MyLinkedList(){

    }

    public void add(T addMe){
        Node<T> nodeToAdd = new Node<>(addMe);

        // tackle the easiest case
        // what to do when the head is null

        if(head == null){
            this.head = nodeToAdd;
            return;
        }

        // tackle the more general case
        // what to do when the head is not null

        Node<T> cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }

        cur.next = nodeToAdd;
    }


    public String toString(){

        String s = "";

        Node<T> cur = this.head;
        while(cur != null){

            s += cur.data + " ";

            cur = cur.next;
        }


        return s;
        
    }


}
