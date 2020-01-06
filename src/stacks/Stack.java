package stacks;

import java.util.Arrays;

public class Stack<T> {

    private int index = 0;
    private int arrayCapacity = 10;
    private Object[] array;

    public Stack() {
        array = new Object[arrayCapacity];
    }

    /**
     * @param item push this item into the stack
     */
    public void push(T item) {
        if (index == arrayCapacity) {
            ExpandArray();
        }
        array[index] = item;
        index++;
    }

    /**
     * Increase the capacity of the array
     */
    private void ExpandArray() {
        arrayCapacity = arrayCapacity * 2;
        Object[] newArr = new Object[arrayCapacity];
        for (int i = 0; i < index; i++)
            newArr[i] = array[i];
        array = newArr;
    }

    /**
     *
     * @return the poped item, which is the last item in the stack
     */
    public Object pop() {
        if (isEmpty()) throw new IllegalStateException("You don't have any items in the stack");
        var temp = array[index - 1];
        index--;
        array[index] = null;
        return temp;
    }


    /**
     * Check if the array is empty
     * @return
     */
    public boolean isEmpty() {
        return index == 0;
    }

    /**
     *
     * @return the last item without removing it
     */
    public Object peek() {
        return array[index - 1];
    }



    public void printItems() {
        Object[] arr = new Object[index];
        for (int i = 0; i < index; i++)
            arr[i] = array[i];
        System.out.println(Arrays.toString(arr));
    }
}
