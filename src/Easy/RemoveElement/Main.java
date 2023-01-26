package Easy.RemoveElement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int notEqualNumbersCount = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            numbers.add(nums[i]);
            notEqualNumbersCount++;
        }
        for (int i = 0; i < numbers.size(); i++) {
            nums[i] = numbers.get(i);
        }
        return notEqualNumbersCount;
    }
}
