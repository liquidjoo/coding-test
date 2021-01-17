package elevenst;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (final Integer value : list) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value < max && value > secondMax) {
                secondMax = value;
            }
        }

        return max + secondMax;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 11, 9, 7);

        System.out.println(findMaxSum(list));
    }
}
