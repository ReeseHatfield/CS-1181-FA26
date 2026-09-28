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

    // 3 -> 1 + 1 + N
    // 500 -> 502
    // 10000000 -> 10000002
    // amount of lines actually ran
    // proportional to the size of the list
    // O(N)
    public T get(int index){

        // 1
        Node<T> cur = this.head;
        // worst case N times
        for(int i = 0; i < index; i++){
            if(cur.next != null){
                cur = cur.next;
            }
            else {

                // throw custom exception
            }
        }

        // 1
        return cur.data;
    }

    // O(1)
    // does not take time proportional to the size of the list
    public void prepend(T thingToAdd){

        Node<T> nodeToAdd = new Node<>(thingToAdd);

        // easy case
        if(this.head == null){
            this.head = nodeToAdd;
            
        }
        else {
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }


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
