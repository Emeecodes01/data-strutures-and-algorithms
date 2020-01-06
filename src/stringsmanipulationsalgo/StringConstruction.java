package stringsmanipulationsalgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringConstruction {

    /**
     *
     * Amanda has a string of lowercase letters that she wants to copy to a new string.
     * She can perform the following operations with the given costs. She can perform them any number of times to construct a new string :
     * Append a character to the end of string  at a cost of 1 dollar.
     * Choose any substring of  and append it to the end of  at no charge.
     * Given  strings , find and print the minimum cost of copying each  to  on a new line.
     *
     * For example, given a string , it can be copied for  dollars. Start by copying ,
     * and  individually at a cost of  dollar per character. String  at this time. Copy  to the end of  at no cost to complete the copy.
     */
    public int stringConstruction(String s) {
        Set<Character> set = new HashSet<>();

        for(char ch: s.toCharArray()) {
            set.add(ch);
        }

        return set.size();
    }
}
