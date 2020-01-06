package stringsmanipulationsalgo;

import java.util.*;
import java.util.regex.Pattern;

public class StringUtils {


    /**
     *Complete the function twoStrings in the editor below. It should return a string,
     * either YES or NO based on whether the strings share a common substring.
     * twoStrings has the following parameter(s):
     *
     * s1, s2: two strings to analyze .
     */
    //O(n)
    static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();

        if (s1 == null || s2 == null)
            return "NO";

        if (s1.isEmpty() || s2.isEmpty())
            return "NO";

        for (char ch: s1.toLowerCase().toCharArray())
            set1.add(ch);

        for (char ch: s2.toLowerCase().toCharArray()) {
            if (set1.contains(ch)){
                return "YES";
            }
        }

        return "NO";
    }


    /**
     * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
     * It is also valid if he can remove just 1 character at 1 index in the string
     * and the remaining characters will occur the same number of times. Given a string ,
     * determine if it is valid. If so, return YES, otherwise return NO.
     */
    public static String isValid(String s) {

        return "NO";
    }


    /**
     *
     *Letters in some of the SOS messages are altered by cosmic radiation during transmission.
     * Given the signal received by Earth as a string, s , determine how many letters of Sami's SOS have been changed by radiation.
     * For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message characters were changed in transit.
     */
    public static int marsExploration(String s) {
        int radiationChangeCount = 0;

        for (int i = 0; i < s.length(); i = i + 3) {
            String j = s.substring(i, i+3);
            if (!j.equals("SOS")) {
                char[] sosChars = j.toCharArray();//this is expected to be of size 3

                if (sosChars[0] != 'S') {
                    radiationChangeCount++;
                }

                if (sosChars[1] != 'O' ){
                    radiationChangeCount++;
                }

                if (sosChars[2] != 'S') {
                    radiationChangeCount++;
                }

            }
        }

       return radiationChangeCount;
    }


    /**
     * We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank.
     * For example, if string s = hereiamstackerrank, it does contain hackerrank, but  does not. In the second case, the second r is missing.
     * If we reorder the first string as , it no longer contains the subsequence due to ordering.
     */
    static String hackerrankInString(String s) {
        return "";
    }


    /***
     Roy wanted to increase his typing speed for programming contests. His friend suggested that he type the sentence "The quick brown fox jumps over the lazy dog" repeatedly.
     This sentence is known as a pangram because it contains every letter of the alphabet.
     After typing the sentence several times, Roy became bored with it so he started to look for other pangrams.
     Given a sentence, determine whether it is a pangram. Ignore case.
     */
    static String pangrams(String s) {

        return  s.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26 ? "pangram" : "not pangram";
    }

    public static boolean isPalindrome(String word) {
        if(word == null) {
            return false;
        }

        if(word == ""){
            return false;
        }

        StringBuilder b = new StringBuilder();
        word  = word.toLowerCase();
        for(int i = word.length() -1; i >= 0 ; i--) {
            b.append(word.charAt(i));
        }

        return word.equals(b.toString());
    }


}
