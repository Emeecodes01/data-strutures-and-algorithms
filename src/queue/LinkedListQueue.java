package queue;


import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue<T> {
    private LinkedList<T> linkedList;

    public LinkedListQueue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(T item) {
        if (linkedList.size() == 0){
            linkedList.addFirst(item);
            return;
        }
        linkedList.addLast(item);
    }


    public T dequeue() {
        if (linkedList.isEmpty())
            throw new IllegalStateException("Queue is empty");

        return linkedList.removeFirst();
    }

    public T peek() {
        if (linkedList.isEmpty())
            throw new IllegalStateException("Queue is empty");

        return linkedList.peek();
    }

    public int size() {
        return linkedList.size();
    }


    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
