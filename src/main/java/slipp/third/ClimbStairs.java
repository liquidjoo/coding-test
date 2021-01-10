package slipp.third;

public class ClimbStairs {

    public int climbStairs(int n) {
        /**
         * (n 번째 계단을 오르는 경우) = (n-1 번째 계단을 오르는 경우) + (n-2 번째 계단을 오르는 경우) 로 정리
         */
        if (n < 3) {
            return n;
        }

        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }
}
