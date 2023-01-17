package Easy.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);
        int minLength = strs[0].length();
        List<HashMap<Integer, Character>> strings = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            strings.add(new HashMap<>());
            for (int j = 0; j < strs[i].length(); j++) {
                strings.get(i).put(j, strs[i].charAt(j));
            }
            if (strs[i].length() < minLength) minLength = strs[i].length();
        }
        prefix.delete(minLength, prefix.length());

        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (prefix.charAt(i) != strings.get(j).get(i)) {
                    prefix.delete(i, prefix.length());
                    return String.valueOf(prefix);
                }
            }
        }

        return String.valueOf(prefix);
    }
}
