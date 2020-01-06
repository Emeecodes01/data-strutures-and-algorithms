package stacks;

public class MinStack {
    private int ARRAY_CAPACITY = 10;
    private int index = 0;
    private int[] array;


    public MinStack() {
        array = new int[ARRAY_CAPACITY];
    }

    public void push(int item) {
        if (isEmpty()) {
            array[index] = item;
            index++;
        }else  {
            int value = peek();
            if (value < item) {
                exchangeValues(item);
            }else {
                array[index - 1] = item;
                index++;
            }
        }

    }


    private void exchangeValues(int item) {
        int temp = pop();
        //array[index] = item;
        push(item);
        //index++;
        push(temp);
        //array[index] = temp;
        index++;
    }



    public int pop() {
        if (isEmpty()) throw new IllegalStateException("You don't have any items in the stack");
        var temp = array[index - 1];
        index--;
        array[index] = 0;
        return temp;
    }

    public int min() {
        return peek();
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int peek() {
        return array[index - 1];
    }
}
