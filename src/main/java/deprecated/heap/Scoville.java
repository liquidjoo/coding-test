package deprecated.heap;

import java.util.*;
import java.util.stream.Collectors;

public class Scoville {

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> scovilles = Arrays.stream(scoville)
                .boxed()
                .collect(Collectors.toCollection(PriorityQueue::new));

        int mixCount = 0;

        while (!isFinish(scovilles, K)) {
            try {
                int lowScoville = scovilles.poll();
                int secondScoville = scovilles.poll();
                int mixScoville = lowScoville + secondScoville * 2;
                scovilles.add(mixScoville);
                mixCount++;
            } catch (NullPointerException e) {
                if (isOver(scovilles, K)) {
                    return -1;
                }
            }
        }

        return mixCount;
    }

    private boolean isFinish(PriorityQueue<Integer> scovilles, int k) {
        return scovilles.stream().noneMatch(integer -> integer < k);
    }

    private boolean isOver(PriorityQueue<Integer> scovilles, int k) {
        return scovilles.stream().noneMatch(integer -> integer >= k);
    }
}
