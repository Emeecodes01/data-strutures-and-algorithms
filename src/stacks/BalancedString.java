package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedString {

    /**
     * @param input
     * @return return true if it's balanced
     */
    public static boolean isBalanced(String input) {
        Stack<Character> charStack = new Stack<>();

        for (char ch: input.toCharArray()){
            if (ch == '(' || ch == '{'|| ch == '<' || ch == '[') {
                charStack.push(ch);
            }

            if(ch == ')' || ch == '}' || ch == '>' || ch == ']') {
                if (charStack.isEmpty()) return  false;
                var top = charStack.pop();

                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == '>' && top != '<')
                        || (ch == ']' && top != '[')) return false;
            }

        }
        return charStack.isEmpty();
    }
}
