package queue;
import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.Stack;

public class StackQueue<T> {

    private Stack<T> s1;
    private Stack<T> s2;

    public StackQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(T item) {
        s1.push(item);
    }


    public T dequeue() {
        if (s2.isEmpty()){
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }


    @Override
    public String toString() {
        var totalLen = s1.toArray().length + s2.toArray().length;
        return Arrays.toString(s2.toArray());
    }
}
