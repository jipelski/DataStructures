public class SingleNode<E> {
    private E value;
    private SingleNode<E> next;

    public SingleNode()
    {
        value = null;
        next = null;
    }

    public SingleNode(E item)
    {
        value = item;
        next = null;
    }

    public SingleNode(E item, SingleNode<E> nextNode)
    {
        value = item;
        next = nextNode;
    }

    public SingleNode(SingleNode<E> nextNode)
    {
        next = nextNode;
    }

    public void setValue(E item)
    {
        value = item;
    }

    public void setNext(SingleNode<E> nextNode)
    {
        next = nextNode;
    }

    public E getValue()
    {
        return value;
    }

    public SingleNode<E> getNext()
    {
        return  next;
    }

    public boolean hasNext()
    {
        return next!= null;
    }

    public boolean isEmpty()
    {
        return value!=null;
    }
}
