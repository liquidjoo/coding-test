package deprecated.slipp.third;

import java.util.Arrays;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        /**
         * sum(nums[i-1]) + num[i], num[i]
         * https://medium.com/@vdongbin/kadanes-algorithm-%EC%B9%B4%EB%8D%B0%EC%9D%B8-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-acbc8c279f29
         */
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i - 1] + nums[i]);
        }
        return Arrays.stream(nums)
                .max()
                .getAsInt();
    }
}
