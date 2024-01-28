public class DoubleNode<E>{
    private E value;
    private DoubleNode<E> prev;
    private DoubleNode<E> next;

    public DoubleNode()
    {
        value = null;
        prev = null;
        next = null;
    }

    public DoubleNode(E item)
    {
        value = item;
        prev = null;
        next = null;
    }

    public DoubleNode(E value, DoubleNode<E> prev, DoubleNode<E> next)
    {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public DoubleNode(DoubleNode<E> prev, DoubleNode<E> next)
    {
        value = null;
        this.prev = prev;
        this.next = next;
    }

    public void setValue(E item)
    {
        value = item;
    }

    public void setNext(DoubleNode<E> next)
    {
        this.next = next;
    }

    public void setPrev(DoubleNode<E> prev)
    {
        this.prev = prev;
    }

    public E getValue()
    {
        return value;
    }

    public DoubleNode<E> getNext()
    {
        return next;
    }

    public DoubleNode<E> getPrev()
    {
        return prev;
    }

    public boolean isEmpty()
    {
        return value==null;
    }

    public boolean hasNext()
    {
        return next != null;
    }

    public boolean hasPrev()
    {
        return prev != null;
    }
}
