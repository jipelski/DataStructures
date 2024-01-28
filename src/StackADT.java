import java.util.EmptyStackException;

public class StackADT<E>{
    private final SingleNode<E> top;
    private int itemCount;

    public StackADT()
    {
        this.top = new SingleNode<>(null, null);
        itemCount = 0;
    }

    public void push(E item)
    {
        SingleNode<E> next = new SingleNode<>(item, top.getNext());
        top.setNext(next);
        itemCount++;
    }

    public E peek()
    {
        if(itemCount==0)
            throw new EmptyStackException();
        return top.getNext().getValue();
    }

    public E pop()
    {
        E answer;
        if(itemCount==0)
            throw new EmptyStackException();

        answer = top.getNext().getValue();

        top.setNext(top.getNext().getNext());
        itemCount--;

        return answer;
    }

    public boolean isEmpty()
    {
        return itemCount==0;
    }

    public int size()
    {
        return itemCount;
    }
}
