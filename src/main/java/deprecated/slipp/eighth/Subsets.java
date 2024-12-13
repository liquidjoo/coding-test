package deprecated.slipp.eighth;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            set(nums, i);
        }
        return result;
    }

    private void set(int[] nums, int value) {
        subset.add(value);
        if (nums.length == value) {
            result.add(new ArrayList<>(subset));
        }

        for (final int num : nums) {
            set(nums, num);
        }
        subset.remove(subset.size() - 1);
    }


}
