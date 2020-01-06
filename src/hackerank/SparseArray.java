package hackerank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArray {

    public static void main(String[] args) {
        String[] s = {"ab", "ab", "abc"};
        String[] sq = {"ab", "abc", "bc"};

        System.out.println(Arrays.toString(matchingStrings(s, sq)));
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        int[] arr = new int[queries.length];

        for (String s: queries) {
            stringIntegerMap.put(s, 0);
        }

        for (String q: strings) {
            if (stringIntegerMap.containsKey(q)){
                int i = stringIntegerMap.get(q);
                stringIntegerMap.put(q, i+1);
            }
        }

        int index = 0;

        for (String a: queries) {
            arr[index++] = stringIntegerMap.get(a);
        }

        return arr;
    }

}
