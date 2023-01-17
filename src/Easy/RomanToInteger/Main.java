package Easy.RomanToInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    private static final HashMap<String, Integer> romanLetters = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int value = 0;
        int[] result;
        List<String> letters = new ArrayList<>(List.of(s.split("")));
        for (int i = 0; i < letters.size(); i++) {
            switch (letters.get(i)) {
                case "I" -> {
                    result = check(1, "V", "X", letters, i);
                    value = value + result[0];
                    i = result[1];
                }
                case "V" -> value = value + 5;
                case "X" -> {
                    result = check(10, "L", "C", letters, i);
                    value = value + result[0];
                    i = result[1];
                }
                case "L" -> value = value + 50;
                case "C" -> {
                    result = check(100, "D", "M", letters, i);
                    value = value + result[0];
                    i = result[1];
                }
                case "D" -> value = value + 500;
                case "M" -> value = value + 1000;
            }
        }
        return value;
    }

    public static int[] check(int multiplier, String firstLetter, String secondLetter, List<String> letters, int i) {
        int value = 0;
        try {
            if (letters.get(i + 1).equals(firstLetter)) {
                value = value + 3 * multiplier;
                i = i + 1;
            } else if (letters.get(i + 1).equals(secondLetter)) {
                value = value + 8 * multiplier;
                i = i + 1;
            }
        }
        catch (IndexOutOfBoundsException ignored) {}
        finally {
            value = value + multiplier;
        }
        return new int[]{value, i};
    }
}