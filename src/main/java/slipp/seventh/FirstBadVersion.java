package slipp.seventh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstBadVersion {

    public int firstBadVersion(int n) {


        return 0;

    }

    public void bSearch(int l, int r, int mid) {
        int left = 0;
        int right = 1;
    }

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public void init(int[][] graph) {
        dfs(graph, 0);
    }

    public void dfs(int[][] graph, int current) {
        path.add(current);
        if (current == graph.length - 1) {
            result.add(path);
        } else {
            for (final int i : graph[current]) {
                dfs(graph, i);
            }
        }
        path.remove(path.size() - 1);
    }
}
