package slipp.third;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length < 3) {
            return Math.max(nums[0], nums[1]);
        }

        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 2];
        }

        return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
}
