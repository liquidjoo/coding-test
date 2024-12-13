package deprecated.slipp.etc1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sum3 {

    public void test() {
        int[] nums = {-1,0,1,2,-1,-4};
    }

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> queue = new LinkedList<>();

    public List<List<Integer>> threeSum(int[] nums) {

        for (final int num : nums) {
            calculate(nums, num);
        }
        return null;
    }

    private void calculate(int[] nums, int value) {
        queue.add(value);
        if (queue.size() == 3) {
            final int sum = queue.stream()
                    .reduce(Integer::sum)
                    .get();
            if (sum == 0) {
                result.add(new ArrayList<>(queue));
            }
        }
    }
}
