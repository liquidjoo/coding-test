package slipp.ninth;

import java.util.Arrays;

public class OrangesRotting {

    public void test() {
        int greed[][] = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        orangesRotting(greed);
    }

    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    if (i == 0 && j == 0) {
                        grid[i][j + 1] = 2;
                        grid[i + 1][j] = 2;
                    } else if (i == 0 && i != grid.length - 1) {
                        grid[i][j + 1] = 2;
                        grid[i + 1][j] = 2;
                        grid[i][j - 1] = 2;
                    } else if (j == grid[i].length - 1) {
                        grid[i - 1][j] = 2;
                        grid[i + 1][j] = 2;
                    } else if (j == 0) {
                        grid[i - 1][j] = 2;
                        grid[i][j + 1] = 2;
                        grid[i + 1][j] = 2;
                    } else {
                        grid[i - 1][j] = 2;
                        grid[i][j + 1] = 2;
                        grid[i + 1][j] = 2;
                        grid[i][j - 1] = 2;
                    }
                }
            }
        }

        for (final int[] ints : grid) {
            System.out.println(Arrays.toString(ints));
        }

        return 0;
    }


}
