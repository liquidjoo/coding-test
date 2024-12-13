package deprecated.slipp.fourth;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

    public void test() {
        int[] arr = {3, -7, 0};

        minimumAbsoluteDifference(arr);
    }

    public int minimumAbsoluteDifference(int[] arr) {
        // arr[i] - arr[j] i != j
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }

        return min;
    }

}
