package greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {

        Map<Integer, Integer> all = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            all.put(i, 1);
        }

        for (final int i : lost) {
            all.put(i, all.getOrDefault(i, 1) - 1);
        }

        for (final int i : reserve) {
            if (all.get(i) == 0) {
                all.put(i, all.getOrDefault(i, 1) + 1);
            } else if (Objects.nonNull(all.get(i - 1)) && all.get(i - 1) == 0) {
                all.put(i - 1, all.getOrDefault(i - 1, 1) + 1);
            } else if (Objects.nonNull(all.get(i + 1)) && all.get(i + 1) == 0) {
                all.put(i + 1, all.getOrDefault(i + 1, 1) + 1);
            }
        }


        return  (int) all.values()
                .stream()
                .filter(a -> a > 0)
                .count();
    }
}
