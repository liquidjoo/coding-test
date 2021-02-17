package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static void main(String... ars) {
        final Solution solution = new Solution();
        solution.partitionLabels("caedbdedda");
    }

    private static class Solution {
        // 실패..
        public List<Integer> partitionLabelsFail(String S) {

            final char[] charArray = S.toCharArray();
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < charArray.length; i++) {
                int lastIndex = S.lastIndexOf(charArray[i]);
                int count = 1;
                if (i == 0) {
                    count = 0;
                }

                for (int j = i + 1; j <= charArray.length; j++) {
                    if (lastIndex >= S.lastIndexOf(charArray[j])) {
                        count++;
                    } else if (lastIndex < S.lastIndexOf(charArray[j])) {
                        lastIndex = S.lastIndexOf(charArray[j]);
                        count++;
                    }

                    if (lastIndex == j) {
                        count++;
                        result.add(count);
                        i = j + 1;
                        break;
                    }
                }
                System.out.println(count);
            }

            return result;
        }

        public List<Integer> partitionLabels(String S) {
            int[] last = new int[26];
            for (int i = 0; i < S.length(); ++i)
                //S.charAt(i) - 'a' 문자를 인덱스로 치환
                last[S.charAt(i) - 'a'] = i;

            int j = 0, anchor = 0;
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < S.length(); ++i) {
                j = Math.max(j, last[S.charAt(i) - 'a']);
                if (i == j) {
                    ans.add(i - anchor + 1);
                    anchor = i + 1;
                }
            }
            return ans;
        }
    }

}

