package stacks;


import java.util.Stack;

public class StringReverser {

    /**
     * @param input This class reverses a giving string
     *
     */
    public static String reverse(String input) {
        Stack<Character> stringStack = new Stack<>();

        if (input == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);
            stringStack.push(c);
        }

        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            reverse.append(stringStack.pop());
        }

        return reverse.toString();
    }
}
