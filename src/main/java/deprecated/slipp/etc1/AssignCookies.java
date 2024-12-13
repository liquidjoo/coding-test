package deprecated.slipp.etc1;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        int childIndex = 0;
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (final int j : s) {
            for (int i = childIndex; i < g.length; i++) {

                if (j >= g[i]) {
                    count++;
                    childIndex = i + 1;
                    break;
                }
            }
        }

        return count;

    }
}
