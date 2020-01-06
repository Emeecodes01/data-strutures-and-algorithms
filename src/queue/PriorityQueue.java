package queue;

import java.util.Arrays;

public class PriorityQueue {
    private int ARRAY_SIZE = 10;
    private int[] array;
    private int index = 0;
    private int size = 0;

    public PriorityQueue() {
        array = new int[ARRAY_SIZE];
    }

    public void enqueue(int item) {
        int i;
        for (i = size - 1; i >= 0; i--) {
            if (array[i] > item) {
                array[i+1] = array[i];
            }else {
                break;
            }
        }

        array[i+1] = item;
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
