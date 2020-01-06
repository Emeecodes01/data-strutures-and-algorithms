package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SimpleCalculator {
    Stack<Object> callStack;

    public SimpleCalculator() {
        callStack = new Stack<>();
    }

    public int execute() {
        Stack<Object> reverseStack = new Stack<>();
        int currentAnswer = 0;

        while (!callStack.isEmpty()){
            reverseStack.push(callStack.pop());
        }

        while (!reverseStack.isEmpty()) {
            var value = reverseStack.pop();
            if (value instanceof String) {
                //it's a sign
                if (value.equals("+")) {
                    var next = (Integer) reverseStack.pop();
                    currentAnswer = currentAnswer + next;
                }else if (value.equals("-")){
                    var next = (Integer) reverseStack.pop();
                    currentAnswer = currentAnswer - next;
                }else if (value.equals("*")){
                    var next = (Integer) reverseStack.pop();
                    currentAnswer = currentAnswer * next;
                }
            }else {
                //int
                currentAnswer = (Integer)value;
            }
        }

        return currentAnswer;
    }


    public int executeString(String input) {
        Stack<Character> callStack = new Stack<>();
        Stack<Character> reverseStack = new Stack<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);


        var a = new int[2];
        var charArray = input.toCharArray();
        for (Character ch: charArray) {
            callStack.push(ch);
        }

        while (!callStack.isEmpty()){
            reverseStack.push(callStack.pop());
        }

        var value = reverseStack.pop();
        return 1;
    }

    public void add() {
        callStack.push("+");
    }

    public void minus(){
        callStack.push("-");
    }

    public void times(){
        callStack.push("*");
    }

    public void addNumber(Integer number){
        callStack.push(number);
    }


    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.addNumber(2);
        sc.add();
        sc.addNumber(58);
        sc.minus();
        sc.addNumber(30);

        System.out.println("Answer: "+sc.execute());
    }
}
