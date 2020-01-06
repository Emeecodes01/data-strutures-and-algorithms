package stacks;


import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringReverser.reverse("Emmanuel"));
        System.out.println(BalancedString.isBalanced("((<1>+[2]))"));

        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);
        intStack.push(8);
        intStack.push(9);
        intStack.push(10);
        intStack.push(11);

//        MinStack minStack = new MinStack();
//        minStack.push(1);
//        minStack.push(2);
//        minStack.push(3);
//        minStack.push(4);

        System.out.println("PRINT BEFORE POOPED...");
        intStack.printItems();

        var result = intStack.pop();
        System.out.println("ITEM POOPED: " +result);
        System.out.println("ITEM PEEK: " +intStack.peek());

        intStack.printItems();

        //System.out.println("MIN ITEM: "+minStack.min());
    }
}
