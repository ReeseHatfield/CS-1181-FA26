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

    public void insert(T valueToAdd, int index){

        Node<T> nodeToAdd = new Node<>(valueToAdd);

        if(this.head == null){
            // throw exception if index != 0
            this.add(valueToAdd);
        }

        Node<T> cur = this.head;
        for(int i = 0; i < index - 1; i ++){
            cur = cur.next;
        }


        nodeToAdd.next = cur.next;
        cur.next = nodeToAdd;

    }

    public T get(int index){

        Node<T> cur = this.head;
        for(int i = 0; i < index; i++){
            if(cur.next != null){
                cur = cur.next;
            }
            else {

                // throw custom exception
            }
        }

        return cur.data;
    }

    public void prepend(T thingToAdd){
        Node<T> nodeToAdd = new Node<>(thingToAdd);

        // easy case
        if(this.head == null){
            this.head = nodeToAdd;
            return;
        }

        nodeToAdd.next = this.head;
        this.head = nodeToAdd;

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
