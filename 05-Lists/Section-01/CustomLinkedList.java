public class CustomLinkedList<E>
{
    Node<E> headNode = null;

    public CustomLinkedList()
    {

    }

    public void add(E newValue)
    {
        Node<E> newNode = new Node<>(newValue);

        if (headNode == null)
        {
            headNode = newNode;
        }
        else
        {

            Node<E> currentNode = headNode;

            while (currentNode.getNext() != null)
            {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);
        }
    }
}
