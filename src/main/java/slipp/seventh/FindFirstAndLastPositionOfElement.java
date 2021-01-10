package slipp.seventh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class FindFirstAndLastPositionOfElement {

    public void test() {
        int[] value = {5, 7, 7, 8, 8, 10};
//        int[] value = {1};
        searchRange(value, 8);
    }

    public int[] searchRange(int[] nums, int target) {

        final int i = Arrays.binarySearch(nums, 0, nums.length / 2 + 1, target);
        final int j = Arrays.binarySearch(nums, nums.length / 2, nums.length, target);

        if (i < 0 && j < 0) {
            return new int[]{-1, -1};
        }

        return new int[]{i, j};

    }
}
