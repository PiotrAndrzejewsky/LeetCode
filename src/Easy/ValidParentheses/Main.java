package Easy.ValidParentheses;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> openingBrackets = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case ')' -> {if (!openingBrackets.pop().equals('(')) return false;}
                    case '}' -> {if (!openingBrackets.pop().equals('{')) return false;}
                    case ']' -> {if (!openingBrackets.pop().equals('[')) return false;}
                    default -> openingBrackets.add(s.charAt(i));
                }
            }
        }
        catch (Exception e) {
            return false;
        }
        return openingBrackets.isEmpty();
    }
}
