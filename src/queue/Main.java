package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        //=================== QUEUE REVERSER ==================
        Queue<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);

        System.out.println(integerQueue);
        QueueReverser.reverse(integerQueue);
        System.out.println(integerQueue);
        //======================================================

        //===================== ARRAY QUEUE ====================
        ArrayQueue<Integer> integerArrayQueue = new ArrayQueue<>();
        integerArrayQueue.enqueue(10);
        integerArrayQueue.enqueue(20);
        integerArrayQueue.enqueue(30);
        integerArrayQueue.enqueue(40);
        integerArrayQueue.enqueue(50);
        integerArrayQueue.dequeue();
        integerArrayQueue.dequeue();
        integerArrayQueue.enqueue(60);
        integerArrayQueue.enqueue(70);
        integerArrayQueue.dequeue();

        //integerArrayQueue.dequeue();

        System.out.println("========= ARRAY QUEUE ==========");
        System.out.println(integerArrayQueue.toString());


        //======================== TWO STACKS QUEUE =======================//
        StackQueue<Integer> stackQueue = new StackQueue<>();
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);
        stackQueue.enqueue(40);
        stackQueue.enqueue(50);

        System.out.println("================ TWO STACKS ==========");
        System.out.println(stackQueue.toString());
        Integer item = stackQueue.dequeue();
        stackQueue.dequeue();
        stackQueue.enqueue(60);
        System.out.println("DEQUEUED THIS: "+item);
        System.out.println(stackQueue.toString());


        System.out.println("================== Priority Queue ================");
        PriorityQueue queue = new PriorityQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(40);
        System.out.println(queue.toString());


        System.out.println("======== Kth items QUEUE REVERSER =============");
        Queue<Integer> arrayQueue = new ArrayDeque<>();

        arrayQueue.add(10);
        arrayQueue.add(20);
        arrayQueue.add(30);
        arrayQueue.add(40);
        arrayQueue.add(50);

        QueueReverser queueReverser = new QueueReverser(arrayQueue);
        queueReverser.reserve(3);
        System.out.println("REVERED KTH QUEUE");
        System.out.println(arrayQueue);


        System.out.println("========= LinkedList Queue ==========");
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);
        linkedListQueue.enqueue(40);

        System.out.println("Linked list");
        System.out.println(linkedListQueue.toString());
        var value = linkedListQueue.dequeue();


        System.out.println("Dequeued value: "+value);
        System.out.println("Peeked value"+linkedListQueue.peek());
        System.out.println("IS EMPTY: " + linkedListQueue.isEmpty());
        System.out.println("SIZE: "+ linkedListQueue.size());

        System.out.println(linkedListQueue.toString());

    }

}
