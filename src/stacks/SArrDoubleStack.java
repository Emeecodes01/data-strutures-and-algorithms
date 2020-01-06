package stacks;

import java.util.Arrays;

//implementing two stacks in one array
public class SArrDoubleStack<T>{
    private int index1 = 0;
    private int index2 = 0;
    private int arrayCapacity = 20;
    private Object[] array;

    public SArrDoubleStack() {
        array = new Object[arrayCapacity];
    }

    /**
     * @param item push this item into the stack
     */
    public void push1(T item) {
        if (index1 == arrayCapacity) {
            ExpandArray();
        }
        array[index1] = item;
        index1++;
    }

    public void push2(T item) {
        if (index2 == arrayCapacity) {
            ExpandArray();
        }
        array[index2] = item;
        index2++;
    }

    /**
     * Increase the capacity of the array
     */
    private void ExpandArray() {
        var tmpCap = arrayCapacity;
        arrayCapacity = arrayCapacity * 2;
        Object[] newArr = new Object[arrayCapacity];
        for (int i = 0; i < tmpCap; i++)
            newArr[i] = array[i];
        array = newArr;
    }

    /**
     *
     * @return the poped item, which is the last item in the stack
     */
    public Object pop1() {
        if (isEmpty1()) throw new StackOverflowError("You don't have any items in the stack");
        var temp = array[index1 - 1];
        index1--;
        array[index1] = null;
        return temp;
    }


    public Object pop2() {
        if (isEmpty2()) throw new StackOverflowError("You don't have any items in the stack");
        var temp = array[index2 - 1];
        index2--;
        array[index2] = null;
        return temp;
    }


    /**
     * Check if the array is empty
     * @return
     */
    public boolean isEmpty1() {
        return index1 == 0;
    }

    public boolean isEmpty2() {
        return index2 == 0;
    }



    public void printItems() {
        Object[] arr = new Object[index1+index2];
        for (int i = 0; i < index1+index2; i++)
            arr[i] = array[i];
        System.out.println(Arrays.toString(arr));
    }

}
