package deprecated.slipp.ninth;

import java.util.Arrays;

public class LargestSumAfterKNegations {

    public void test() {
        int[] a = {3, -1, 0, 2};

        System.out.println(largestSumAfterKNegations(a, 3));
    }

    public int largestSumAfterKNegations(int[] A, int K) {
        // 음수를 먼저 바꾼다.
        // 모든 값이 양 수 일 때 가장 작은 수를 변경 한다.

        int count = K;
        while (count != 0) {
            Arrays.sort(A);
            A[0] = -A[0];
            count--;
        }

        return Arrays.stream(A).sum();
    }
}
