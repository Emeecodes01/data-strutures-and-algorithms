package hackerank;

//QUESTION

import java.util.Arrays;
import java.util.Stack;

/**
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).
 *
 * Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
 *
 * Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
 *
 * Input Format
 *
 * The first line contains an integer,  (the number of integers in ).
 * The second line contains  space-separated integers describing .
 *
 * Constraints
 *
 * Output Format
 *
 * Print all  integers in  in reverse order as a single line of space-separated integers.
 *
 * */
public class ArrayReverser {

    public static void main(String[] args) {
        int[] ints = {3, 2, 5, 4, 6, 1};

        System.out.println(Arrays.toString(reverse(ints)));
    }

    public static int[] reverse(int[] arrs) {
        Stack<Integer> integerStack = new Stack<>();
        int[] arr = new int[arrs.length];

        for (int i = 0; i< arrs.length; i++){
            integerStack.push(arrs[i]);
        }

        int index = 0;
        while (!integerStack.isEmpty()){
            arr[index] = integerStack.pop();
            index++;
        }
        return arr;
    }
}
