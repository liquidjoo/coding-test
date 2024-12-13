package deprecated.slipp.version2.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String ...args) {
        int[] a = {10,1,2,7,6,1,5};
        int target = 8;
        final Solution solution = new Solution();
        final List<List<Integer>> lists = solution.combinationSum2(a, target);

        for (final List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    static class Solution {

        private List<List<Integer>> result;
        private List<Integer> path;

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            result = new ArrayList<>();
            path = new ArrayList<>();
            dfs(candidates, target, 0);
            return result;
        }

        private void dfs(int[] candidates, int target, int index) {
            path.add(candidates[index]);
            int sum = path.stream().mapToInt(Integer::intValue).sum();
            if (sum == target) {
                result.add(new ArrayList<>(path));
                return;
            } else if (sum > target) {
                path.remove(path.size() - 1);
            }

            for (int i = index; i < candidates.length; i++) {
                if (index == i) {
                    continue;
                }
                dfs(candidates, target, i);
            }
        }
    }

}
