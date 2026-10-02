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

    public int size()
    {
        if (headNode == null)
        {
            return 0;
        }

        int size = 1;
        Node<E> currentNode = headNode;

        while (currentNode.getNext() != null)
        {
            size++;
            currentNode = currentNode.getNext();
        }

        return size;
    }

    @Override
    public String toString()
    {
        if (headNode == null)
        {
            return "[]";
        }

        String output = "[";
        Node<E> currentNode = headNode;

        for (int i = 0; i < size(); i++)
        {
            output = output + currentNode.getValue();

            if (i != size() - 1)
            {
                output += ", ";
            }

            if (currentNode.getNext() != null)
            {
                currentNode = currentNode.getNext();
            }
        }

        return output + "]";
    }

    public E get(int index)
    {
        if (index >= size() || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = headNode;

        for (int i = 0; i < index; i++)
        {
            currentNode = currentNode.getNext();
        }

        return currentNode.getValue();
    }

    public void replace(int index, E value)
    {
        if (index >= size() || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = headNode;

        for (int i = 0; i < index; i++)
        {
            currentNode = currentNode.getNext();
        }

        currentNode.setValue(value);
    }

    public void insert(int index, E value)
    {
        if (index >= size() || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Node<E> currentNode = headNode;
        Node<E> newNode = new Node<>(value);

        if (index == 0)
        {
            newNode.setNext(currentNode);
            headNode = newNode;
        }
        else
        {

            for (int i = 0; i < index - 1; i++)
            {
                currentNode = currentNode.getNext();
            }

            Node<E> tempNode = currentNode.getNext();
            newNode.setNext(tempNode);
            currentNode.setNext(newNode);
        }
    }
}
