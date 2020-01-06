package queue;

import java.util.Arrays;

public class ArrayQueue<T>{
    private Object[] array;
    private int ARRAY_CAPACITY = 5;
    private int fPointer, ePointer;
    private int arraySize = 0;


    public ArrayQueue() {
        this.array = new Object[ARRAY_CAPACITY];
        fPointer = ePointer = 0;
    }


    public void enqueue(T item) {
        //use the last pointer to add item to the array
        array[ePointer] = item;
        arraySize++;
        ePointer = (ePointer + 1) % array.length;
    }


    public Object dequeue() {
        var tmp = array[fPointer];
        array[fPointer] = 0;
        fPointer = (fPointer + 1) % array.length;
        arraySize--;
        return tmp;
    }

    public Object peek() {
        return array[ePointer];
    }


    public boolean isEmpty() {
        return arraySize == 0;
    }


    public boolean isFull() {
        return arraySize == ARRAY_CAPACITY;
    }


    @Override
    public String toString() {
        return Arrays.toString(array);
    }


}
