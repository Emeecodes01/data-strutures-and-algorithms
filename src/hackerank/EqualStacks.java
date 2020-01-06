package hackerank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class EqualStacks {


    public static void main(String[] args) {
        int[] h1 = {1, 1, 1, 2, 3};
        int[] h2 = {2, 3, 4};
        int[] h3 = {1, 4, 1, 1};

        System.out.println(equalStacks(h1, h2, h3));
    }


    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        //Stack[] stacks = {getStackFromArray(h1), getStackFromArray(h2), getStackFromArray(h3)};
        Map<Stack, Integer> stackToSumMap = new HashMap<>();
        stackToSumMap.put(getStackFromArray(h1), getSumOfArray(h1));
        stackToSumMap.put(getStackFromArray(h2), getSumOfArray(h2));
        stackToSumMap.put(getStackFromArray(h3), getSumOfArray(h3));

        int totalSum = 0;

        for (Map.Entry<Stack, Integer> entry: stackToSumMap.entrySet()) {
            totalSum += sumOfStack(entry.getKey());
            if (totalSum % 3 == 0){
                //they are equal
                return totalSum;
            }else  {

            }
        }
        return 0;
    }

    static Stack<Integer> getStackFromArray(int [] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i: arr) {
            stack.push(i);
        }
        return stack;
    }


    static int getSumOfArray(int[] arr) {
        int sum = 0;
        for (int j: arr) {
            sum += j;
        }
        return sum;
    }

    static int sumOfStack(Stack<Integer> stack) {
        int sum = 0;
        Stack<Integer> helperStack = new Stack<>();//temporary save items while we compute the sum

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            helperStack.push(temp);
            sum += temp;
        }

        while (!helperStack.isEmpty()){
            stack.push(helperStack.pop());
        }

        return sum;
    }

    public static boolean areTheyEqual(int... a) {
        int VALUE = a[0];
        for(int i: a) {
            if(i!= VALUE)
                return false;
        }
        return true;
    }

}
