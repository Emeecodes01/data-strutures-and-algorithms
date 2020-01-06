package stringsmanipulationsalgo;

import java.util.*;

/*
* Find the number of vowels in a string. Vowels in English are A, E, O, U and I. Input: “hello”
* Output: 2
 * */
public class SimpleStringManipulations {

    public static void main(String[] args) {
        String word = "hello";
        String longWord = "Trees are beautiful";
        System.out.println("Number of vowels are: "+vowelCount(word));
        System.out.println("Reverse a string: "+reverseString(word));
        System.out.println("Reverse words: "+reverseWord(longWord));
        System.out.println("IS ROTATION: "+isRotation("ABCD", "DABC"));
        System.out.println("REMOVE DUPLICATES: "+removeDuplicate("Hellooo!!"));
        System.out.println("MOST REPEATING: "+mostRepeatedChar("Hellooo!!"));
        System.out.println("CAPITALISATION: "+capitaliseFirstLetters("trees    are beautiful"));
        System.out.println("IS palindrome: "+isPalindrome(null));
    }


    /**
     * This method returns the number of vowels in a word
     * @param input
     * @return
     */
    private static int vowelCount(String input) {

        int vowelsCount = 0;
        Character[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> characterSet = new HashSet<>(Arrays.asList(chars));

        var charArray = input.toCharArray();

        for (Character ch: charArray) { //0(n)

            if (characterSet.contains(ch)){//0(1)
                vowelsCount++;
            }
        }

        return vowelsCount;
    }


    /**
     * Reverse a string.  Input: “hello”
     * Output: “olleh”
     * @param input
     * @return
     */
    public static String reverseString(String input) {
        Stack<Character> characterStack = new Stack<>();


        char[] chars = input.toCharArray();
        for (char ch: chars) {
            characterStack.push(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!characterStack.isEmpty()){
            stringBuilder.append(characterStack.pop());
        }

        return stringBuilder.toString();
    }


    /**
     * 3- Reverse the order of words in a sentence.
     * Input: “Trees are beautiful”
     * Output: “beautiful are Trees”
     *
     * @param wordInput
     * @return
     */
    public static String reverseWord(String wordInput) {
        Stack<String> stringStack = new Stack<>();

        String[] words = wordInput.split(" ");

        for (String word: words) {
            stringStack.push(word);
        }

        StringBuilder builder = new StringBuilder();
        while (!stringStack.isEmpty()) {
            builder.append(stringStack.pop()+" ");
        }

        return builder.toString();

    }

    /**
     *
     * Check if a string is a rotation of another string.
     * Input: “ABCD”, “DABC” (rotate one char to the right)
     * Output: true
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1 == null && s2 == null)
            return false;

        return (s1.length() == s2.length()) && (s1+s2).contains(s2);
    }


    /**
     * Remove duplicate characters in a string.
     * Input: “Hellooo!!”
     * Output: “Helo!”
     */
    public static String removeDuplicate(String s) {

        Set<Character> characterSet = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        if (s == null)
            return "";

        char[] strArr = s.toCharArray();

        for (char sa: strArr) {
            if (!characterSet.contains(sa)){
                characterSet.add(sa);
                builder.append(sa);
            }
        }

        return builder.toString();
    }


    /**
     *
     * Find the most repeated character in a string.
     * Input: “Hellooo!!”
     * Output: ‘o’
     *
     */
    public static String mostRepeatedChar(String letters) {
        int mostOccuring = 0;
        String ch1 = "";

        if (letters == null){
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch: letters.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            }else  {
                int i = map.get(ch);
                i++;
                map.put(ch, i);
            }
        }

        for (var entry: map.entrySet()) {
            int j = entry.getValue();
            if (mostOccuring < j) {
                mostOccuring = j;
                ch1 = entry.getKey().toString();
            }
        }

        return ch1;
    }


    /**
     *
     * Capitalize the first letter of each word in a sentence. Also, remove any extra spaces between words.
     * Input: “trees are beautiful”
     * Output: “Trees Are Beautiful” 
     */
    public static String capitaliseFirstLetters(String sentence) {
        if (sentence == null)
            return "";

        if (sentence.trim().isEmpty())
            return "";

        String[] sentenceList = sentence.trim()
                .replaceAll(" +", " ")
                .split(" ");


        StringBuilder builder = new StringBuilder();

        for (String sen: sentenceList) {
            char[] chars = sen.toCharArray();
            var first = chars[0];
            var upper = Character.toString(first).toUpperCase();
            chars[0] = upper.charAt(0);

            builder.append(new String(chars)+" ");
        }

        return builder.toString().trim();
    }


    /**
     * Check if a string is palindrome. If we read a palindrome string from left or right, we get the exact same characters.
     * Input: “abba”
     * Output: true
     */
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty())
            return true;

        StringBuilder builder = new StringBuilder();

        char[] chars = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }

        String reversed = builder.toString();
        return input.equals(reversed);
    }

}
