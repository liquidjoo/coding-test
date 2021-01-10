package slipp.etc1;

import java.util.Arrays;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        String sub = t;
        for (final char c : s.toCharArray()) {
            final String[] split = sub.split(Character.toString(c), 2);

            System.out.println(Arrays.toString(split));
            if (split[0].length() == sub.length()) {
                return false;
            }

            if (split.length > 1) {
                sub = split[1];
            }
        }

        return true;
    }
}
