package elevenst;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        int largeNumber1 = list.get(0);
        int largeNumber2 = list.get(1);
        int tmp = 0;

        if (largeNumber1 < largeNumber2) {
            tmp = largeNumber1;
            largeNumber1 = largeNumber2;
            largeNumber2 = tmp;
        }

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5);

        System.out.println(findMaxSum(list));
    }
}
