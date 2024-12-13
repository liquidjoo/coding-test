package deprecated.slipp.version2.week1;

import java.util.Arrays;

public class ProductOfArrayExcept {

    public static void main(String... args) {
        int[] input = {1, 2, 3, 4};
        final Solution solution = new Solution();
        final int[] values = solution.productExceptSelf(input);

        System.out.println(Arrays.toString(values));
    }

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = except(nums, i);
            }
            return result;
        }

        private int except(int[] nums, int index) {
            int value = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i == index) continue;
                value = value * nums[i];
            }

            return value;
        }
    }
}
