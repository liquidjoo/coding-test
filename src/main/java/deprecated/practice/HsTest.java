package deprecated.practice;

public class HsTest {

    public static void main(String ...args) {
        Solution solution = new Solution();
        solution.solution(11);
    }

    static class Solution {
        public long solution(long n) {
            long answer = 0;

            StringBuilder binaryValue = new StringBuilder();
            while (n != 1) {
                binaryValue.append(n % 2);
                n = n/2;
            }

            binaryValue.append(n);
            final String binaryValues = binaryValue.toString();
            final char[] charArray = binaryValues.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                final long l = Long.parseLong(String.valueOf(charArray[i]));
                if (l != 0) {
                    double v = Math.pow(3, (double) i);
                    answer += (long)v;
                }
            }

            return answer;
        }
    }
}
