public class QueueListADT<E> {
    private final SingleNode<E> front;
    private final SingleNode<E> rear;
    private int itemCount;

    public QueueListADT()
    {
        front = new SingleNode<>(null, null);
        rear = new SingleNode<>(null, null);
        itemCount = 0;
    }

    public void offer(E item)
    {
        SingleNode<E> newNode = new SingleNode<>(item);
        if (itemCount == 0) {
            front.setNext(newNode);
            rear.setNext(newNode);
        }
        else
        {
            rear.getNext().setNext(newNode);
            rear.setNext(newNode);
        }
        itemCount++;
    }

    public E poll()
    {
        E answer;
        if(itemCount==0)
            throw new RuntimeException("EmptyQueueException");
        answer = front.getNext().getValue();
        front.setNext(front.getNext().getNext());

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

    public E peekHead()
    {
        if (itemCount == 0)
            throw new RuntimeException("EmptyQueueException");
        return front.getNext().getValue();
    }

    public E peekTail()
    {
        if (itemCount == 0)
            throw new RuntimeException("EmptyQueueException");
        return rear.getNext().getValue();
    }
}
