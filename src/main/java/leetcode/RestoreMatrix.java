package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestoreMatrix {

    public static void main(String... args) {
        int[] a = {3, 5, 7, 10};
        final Solution solution = new Solution();
        solution.minDiffWeight(a);
    }

//    class Solution {
//        public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
//
//
//        }
//    }

    static class Solution {
        public void restoreMatrix() {

        }

        public int oneToZero(int number) {
            int index = 1;
            while (true) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < index; j++) {
                    stringBuilder.append("1");
                }
                int value = Integer.parseInt(stringBuilder.toString());
                if ((value % number) == 0) {
                    return value;
                }

                for (int j = 0; j < index; j++) {
                    stringBuilder.append("0");
                    value = Integer.parseInt(stringBuilder.toString());
                    if ((value % number) == 0) {
                        return value;
                    }
                }
                index++;
            }
        }

        List<Integer> left = new ArrayList<>();
        List<List<Integer>> leftValues = new ArrayList<>();

        public int minDiffWeight(int[] data) {
            int min = Integer.MAX_VALUE;

            for (int size = 1; size < data.length + 1; size++) {
                for (int i = 0; i < data.length; i++) {
                    recursive(data, i, size);
                }
            }

            for (final List<Integer> list : leftValues) {
                int leftSum = 0;
                for (int i = 0; i < data.length; i++) {
                    if (list.contains(i)) {
                        leftSum += data[i];
                    }
                }

                int rightSum = 0;
                for (int i = 0; i < data.length; i++) {
                    if (list.contains(i)) {
                        continue;
                    }
                    rightSum += data[i];
                }
                min = Math.min(Math.abs(leftSum - rightSum), min);
            }
            return min;
        }

        private void recursive(int[] data, int index, int size) {
            left.add(index);
            if (left.size() == size) {
                leftValues.add(new ArrayList<>(left));
            } else {
                for (int i = 0; i < data.length; i++) {
                    if (i == index) {
                        continue;
                    }
                    recursive(data, i, size);
                }
            }
            left.remove(left.size() - 1);
        }
    }
}
