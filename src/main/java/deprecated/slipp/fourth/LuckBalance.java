package deprecated.slipp.fourth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

    public void test() {

        int[][] arr = {
                {5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}
        };




        luckBalance(3, arr);
    }

    static int luckBalance(int k, int[][] contests) {
        int maxLuck = 0;
        int l = k;

        final List<int[]> collect = Arrays.stream(contests)
                .sorted((o1, o2) -> {
                    System.out.println(o1[0] + "::" + o2[0]);
                    if (o1[0] < o2[0]) {
                        return 1;
                    } else if (o1[0] > o2[0]) {
                        return -1;
                    }
                    return 0;
                })
                .collect(Collectors.toList());

        for (final int[] ints : collect) {
            if (ints[1] == 0) {
                maxLuck += ints[0];
            } else {
                if (l > 0) {
                    maxLuck += ints[0];
                    l--;
                } else {
                    maxLuck -= ints[0];
                }
            }
        }


        return maxLuck;
    }
}
