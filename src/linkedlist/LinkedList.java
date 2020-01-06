package linkedlist;

public class LinkedList<T> {
    private Node first;
    private Node last;
    private int size;


    private class Node {
        private T value;
        private Node next;

        public Node(T value){
            this.value = value;
        }
    }

    /**
     *
     * @param value, add this value to the end of the linked list
     */
    public void addLast(T value) {
        var node = new Node(value);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    /**
     *
     * @param  value add this to the begining of the list
     */
    public void addFirst(T value) {
        var node = new Node(value);
        if (first == null)
            first = last = node;
        else {
            var temp = first;
            first = node;
            first.next = temp;
        }

        size++;
    }


    /**
     *
     * @param value
     * @return the index of this value in the linkedlist
     */
    public int indexOf(T value){
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == value){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }


    /**
     *
     * @param value
     * @return true is the linkedList contains the value else returns false
     */
    public boolean contains(T value) {
        var current = first;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    /**
     *
     * @return the numbers of item in the linkedList
     */
    public int size() {
        return size;
    }

    /**
     * Remove the first item in the linkedList
     */
    public void removeFirst() {
        var temp = first.next;
        first = null;
        first = temp;

        size--;
    }


    /**
     * remove the last item
     */
    public void removeLast() {
        //get the last item value

        if (first == null){
            throw new IllegalArgumentException();
        }

        last = getB4Last(last);
        last.next = null;

        size--;
    }

    /**
     *
     * @param node this is the last node
     * @return gets the previous item b4 the last
     */
    private Node getB4Last(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }

        return null;
    }

    /**
     * Convert this linked List into an array
     * @return
     */
    public Object[] toArray() {
        var current = first;
        int index = 0;

        Object[] arr = new Object[size];

        while (current != null) {
            arr[index] = current.value;
            current = current.next;
            index++;
        }
        return arr;
    }


    /**
     * Meet to reverse a linkedList
     * @return
     */
    public Object[] reverse() {

        var prev = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = prev;
        return toArray();
    }


    /**
     *
     * @param k the node to return it's value
     * @return the value of kth node
     */
    public T getKthNodeFromEnd(int k) {
        var d = k - 1;

        if (first == null){
            throw new IllegalArgumentException("Invalid operation: empty linked list");
        }
        var firstPointer = first;
        var secondPointer = firstPointer.next;
        for (int i = 0; i < d; i++) { //0(n)
            if (secondPointer == null) {
                throw new IllegalArgumentException();
            }
            secondPointer = secondPointer.next;
        }

        while (secondPointer != null) {//o(n)
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return  firstPointer.value;
    }

    /**
     * This prints the middle not in one pass
     */
    public void printMiddle() {
        //[1 -> 3 -> 4] => 3
        //mid point 2
        var firstPointer = first;
        var secondPoint = first;

        while (secondPoint != last && secondPoint.next != last) {
            firstPointer = firstPointer.next;
            secondPoint = secondPoint.next.next;
        }

        System.out.println("Middle value: " + firstPointer.value);

    }


}
