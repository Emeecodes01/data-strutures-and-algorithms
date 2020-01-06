package stringsmanipulationsalgo;

import array.Array;
import java.util.*;

/**
 * This calculates the number of words in a camel cased string
 */
public class CamelCase {

    /**
     *
     * @param s -> camel cased string
     * @return
     */
    static int countWords(String s) {
        if (s == null) {
            return 0;
        }

        if (s.isEmpty()) {
            return 0;
        }

        Set<Character> charSet = new HashSet<>();
        Character[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                         'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        charSet.addAll(Arrays.asList(chars));

        int count = 0;

        char[] chs = s.toCharArray();
        for (char ch: chs) {
            if (charSet.contains(ch)){
                count++;
            }
        }
        return count+1;
    }
}
