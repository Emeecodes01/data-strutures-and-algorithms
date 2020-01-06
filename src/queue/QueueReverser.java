package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    private Queue<Integer> mQueue;

    public QueueReverser(Queue<Integer> mQueue) {
        this.mQueue = mQueue;
    }

    public static void reverse(Queue<Integer> integerQueue) {
        Stack<Integer> integerStack = new Stack<>();

        if (integerQueue.isEmpty()) return;

        while (!integerQueue.isEmpty())
            integerStack.push(integerQueue.remove());

        while (!integerStack.isEmpty())
            integerQueue.add(integerStack.pop());
    }



    //O(n) -- time complexity
    /**
     * @param k is first kth number you want to reverse in the queue(mQueue)
     */
    public void reserve(int k) {
        Stack<Integer> intStack = new Stack<>();
        Queue<Integer> integerQueue = new ArrayDeque<>();

        if (mQueue.isEmpty()){
            return;
        }

        if (mQueue.size() == 1) {
            return;
        }

        if (k > mQueue.size()){
            throw new IllegalArgumentException("k is larger than the size of the array");
        }

        while (intStack.size() < k) {
            intStack.push(mQueue.remove());
        }

        while (!mQueue.isEmpty()) {
            integerQueue.add(mQueue.remove());
        }


        if (mQueue.isEmpty()) {
            while (!intStack.isEmpty()) {
                mQueue.add(intStack.pop());
            }

            while (!integerQueue.isEmpty()){
                mQueue.add(integerQueue.remove());
            }
        }


    }

}
