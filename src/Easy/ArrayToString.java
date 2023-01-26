package Easy;

public class ArrayToString {

    public static void arrayToString(int[] digits) {
        System.out.print("[");
        for (int i = 0; i < digits.length - 1; i++) {
            System.out.print(digits[i] + ",");
        }
        System.out.print(digits[digits.length - 1] + "]");
    }
}
