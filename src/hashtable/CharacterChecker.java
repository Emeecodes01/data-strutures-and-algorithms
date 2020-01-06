package hashtable;

import java.util.HashMap;
import java.util.Map;

public class CharacterChecker {

    public void getFirstRepeatingCharacter(String input) {
        var trimed = input.trim();
        Map<Character, Integer> charToOccurence = new HashMap<>();
        char character = 0;

        var charArray = trimed.toCharArray();

        for (char ch: charArray) {
            if (charToOccurence.containsKey(ch)){
                var value = charToOccurence.get(ch) + 1;
                charToOccurence.put(ch, value);
            }else {
                charToOccurence.put(ch, 1);
            }
        }

        for (char ch: charArray){
            if (charToOccurence.get(ch) > 1){
                character = ch;
                break;
            }
        }

        System.out.println("First repeating character");
        System.out.println(character);

    }


    /**
     * e.g an apple will return n,
     * @param string
     */
    public void getFirstNonRepeatingCharacter(String string){
        var trimed = string.trim();
        Map<Character, Integer> charToOccurence = new HashMap<>();
        char character = 0;

        var charArray = trimed.toCharArray();

        for (char ch: charArray) {
            if (charToOccurence.containsKey(ch)){
                var value = charToOccurence.get(ch) + 1;
                charToOccurence.put(ch, value);
            }else {
                charToOccurence.put(ch, 1);
            }
        }

        for (char ch: charArray){
            if (charToOccurence.get(ch) == 1){
                character = ch;
                break;
            }
        }

        System.out.println("First non repeating character");
        System.out.println(character);
    }
}
