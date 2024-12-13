package deprecated.slipp.fourth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GreedyFlorist {

    public void test() {
        int[] a = {2, 5, 6};

        getMinimumCost(3, a);
    }

    // k people group, c cost
    static int getMinimumCost(int k, int[] c) {

        final List<Integer> collect = Arrays.stream(c)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int index = 0;
        int value;
        int sum = 0;

        for (final Integer integer : collect) {
            value = index / k;
            sum += (value + 1) * integer;
            index++;
        }

        return sum;
    }
}
