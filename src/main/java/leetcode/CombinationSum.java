package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> paths;
    List<Integer> queue;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        paths = new ArrayList<>();
        queue = new ArrayList<>();

        for (final int candidate : candidates) {
            int sum = target;

            while (sum >= 0) {
                if (sum - candidate >= 0) {
                    queue.add(candidate);
                    sum = sum - candidate;
                } else {
                    break;
                }
            }
        }


        return paths;
    }

}
