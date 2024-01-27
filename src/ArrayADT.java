public class ArrayADT<E> {
    private E[] data;
    private int size;

    public ArrayADT()
    {
        final int INITIAL_CAPACITY = 10;
        this.data = (E[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public ArrayADT(int initialCapacity)
    {
        if (initialCapacity <= 0)
            throw new NegativeArraySizeException("Array size is less than 0. size: " + initialCapacity);
        this.data = (E[]) new Object[initialCapacity];
        this.size = 0;
    }

    public void add(E item)
    {
        if (size < 0)
            throw new NegativeArraySizeException("Array size is less than 0. size: " + size);

        ensureCapacity(size);
        data[size] = item;
        size++;
    }

    public void add(int index, E item)
    {
        if (index < 0)
            throw new IndexOutOfBoundsException("index: " + index);
        if (index >size)
            throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        ensureCapacity(index);
        if (data[index] == null)
            size++;
        data[index] = item;
    }

    public void remove(int index)
    {
        if(index < 0)
            throw new IllegalArgumentException("Index value is less than 0. index: " + index);
        if(index >= size)
            throw new IllegalArgumentException("Index value is greater than the size of the array. index: " + index);

        System.arraycopy(data, index+1, data, index, size-index);
        size--;
    }

    public E get(int index)
    {
        if(index < 0)
            throw new IllegalArgumentException("Index value is less than 0. index: " + index);
        if(index >= size)
            throw new IllegalArgumentException("Index value is greater than the size of the array. index: " + index);

        return data[index];
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private void ensureCapacity(int size) {
        if(data.length == size)
        {
            E[] biggerArray = (E[]) new Object[size*2 + 1];
            System.arraycopy(data, 0, biggerArray, 0, size);
            data = biggerArray;
        }
    }
}
