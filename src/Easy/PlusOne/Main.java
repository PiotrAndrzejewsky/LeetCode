package Easy.PlusOne;

public class Main {

    public static void main(String[] args) {
        plusOne(new int[] {9});
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
        newDigits[0] = 1;
        return newDigits;
    }

    public static void arrayToString(int[] digits) {
        System.out.print("[");
        for (int i = 0; i < digits.length - 1; i++) {
            System.out.print(digits[i] + ",");
        }
        System.out.print(digits[digits.length - 1] + "]");
    }
}
