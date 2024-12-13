package deprecated.slipp.version2.week4;

import java.util.Arrays;

public class SpiralMatrix {

    public static void main(String... args) {
        final Solution solution = new Solution();
        final int[][] ints = solution.generateMatrix(3);

        for (final int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }

    static class Solution {
        public int[][] generateMatrix(int n) {

            int[][] matrix = new int[n][n];
            int index = 1;

            int value = 0;

            while (index < n * n) {

                for (int i = value; i < n; i++) {
                    matrix[value][i] = index;
                    index = index + 1;
                }

                for (int i = value; i < n; i++) {
                    if (matrix[i][n - 1] == 0) {
                        matrix[i][n - 1] = index;
                    } else {
                        index = index - 1;
                        matrix[i][n - 1] = index;
                    }
                    index = index + 1;
                }


                for (int i = n - 1; i > value; i--) {
                    if (matrix[n - 1][i] == 0) {
                        matrix[n - 1][i] = index;
                    } else {
                        index = index - 1;
                        matrix[n - 1][i] = index;
                    }
                    index = index + 1;
                }

                for (int i = n - 1; i > value; i--) {
                    if (matrix[i][value] == 0) {
                        matrix[i][value] = index;
                    } else {
                        index = index - 1;
                        matrix[i][value] = index;
                    }
                    index = index + 1;
                }
                value = value + 1;
            }

            return matrix;

        }

    }
}
