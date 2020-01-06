package linkedlist;

import javax.swing.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        var linkedList = new LinkedList<Integer>();
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
//        linkedList.addLast(7);
        linkedList.addFirst(1);
        linkedList.addFirst(0);
//
//        System.out.println("INDEX IS: ");
//        System.out.println(linkedList.indexOf(5));
//
//        System.out.println("SIZE OF LINKED LIST");
//        System.out.println(linkedList.size());
//
//        System.out.println("CONTAINS VALUE");
//        System.out.println(linkedList.contains(10));
//
//        //linkedList.removeFirst();
//        linkedList.removeLast();
//
        var arr = linkedList.toArray();
        System.out.println("ARRAY");
        System.out.println(Arrays.toString(arr));
//
//
//        System.out.println("REVERSE A LINKED LIST");
//        var array = linkedList.reverse();
//        System.out.println(Arrays.toString(array));

        System.out.println("Kth NODE FROM LAST");
        System.out.println("ANSWER:" + linkedList.getKthNodeFromEnd(2));

        linkedList.printMiddle();

    }
}
