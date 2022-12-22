package Easy.PalindromeNumber;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String[] parts = Integer.toString(x).split("");
        int j = parts.length - 1;
        for (String part : parts) {
            if (!Objects.equals(part, parts[j])) {
                return false;
            }
            j--;
        }

        return true;
    }
}
