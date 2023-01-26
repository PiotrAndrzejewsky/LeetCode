package Medium.MaximumSubArray;

import Medium.ArrayToString;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1}));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > maxSum) maxSum = sum;
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}
