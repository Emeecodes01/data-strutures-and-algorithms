package linkedlist;

import java.math.BigInteger;
import java.util.Stack;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddToNumbers {


    public static void main(String[] args) {
//        ListNode l1 = new ListNode(9);
//        ListNode xNode = add(l1, 4);
//        ListNode finalNode = add(xNode, 3);
//
//
//        ListNode l2 = new ListNode(1);
//        ListNode yNode = add(l2, 9);
//        ListNode finalNode2 = add(yNode, 9);

        int[] l1Arr = {9};
        int[] l2Arr = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        ListNode l1 = fromArrayToListNode(l1Arr);
        ListNode l2 = fromArrayToListNode(l2Arr);

        ListNode listNode = addTwoNumbers2(l1, l2);
        System.out.println(listNode);
    }


    private static ListNode fromArrayToListNode(int[] arr) {
        ListNode current = new ListNode(arr[0]);
        ListNode first = current;

        if (arr.length > 1){
            for (int i = 1; i < arr.length; i++){
                var node = new ListNode(arr[i]);
                current.next = node;
                current = current.next;
            }
        }
        return first;
    }

    public static ListNode add(ListNode parent, int num) {
        var lNode = new ListNode(num);
        parent.next = lNode;
        return lNode;
    }

    //O(n) -time complexity
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> integerStack1 = new Stack<>();
        Stack<Integer> integerStack2 = new Stack<>();

        ListNode c1 = l1;
        while (c1 != null) {
            integerStack1.push(c1.val);
            c1 = c1.next;
        }

        ListNode c2 = l2;
        while (c2 != null) {
            integerStack2.push(c2.val);
            c2 = c2.next;
        }

        StringBuilder stringBuilder1 = new StringBuilder();
        while (!integerStack1.isEmpty()) {
            stringBuilder1.append(integerStack1.pop());
        }

        StringBuilder stringBuilder2 = new StringBuilder();
        while (!integerStack2.isEmpty()) {
            stringBuilder2.append(integerStack2.pop());
        }


        Stack<Integer> answerStack = new Stack<>();
        BigInteger total;
        total = new BigInteger(stringBuilder1.toString()).add(new BigInteger(stringBuilder2.toString()));

        String totalStr = String.valueOf(total);

        for (Character ch: totalStr.toCharArray()) {
            answerStack.push(Integer.parseInt(ch.toString()));
        }

        ListNode answer = new ListNode(answerStack.pop());
        ListNode first = answer;

        while (!answerStack.isEmpty()) {
            int ansNode = answerStack.pop();
            answer.next = new ListNode(ansNode);
            answer = answer.next;
        }

        return first;
    }



    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;

        int carry = 0;

        while(l1 != null || l2 != null){

            int sum =  (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum/10;

            l3.next = new ListNode(sum % 10);


            if(l1 != null){
                l1 = l1.next;
            } if(l2 != null){
                l2=l2.next;
            }
            l3=l3.next;
        }

        if(carry > 0) {
            l3.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    private static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }

    }

}
