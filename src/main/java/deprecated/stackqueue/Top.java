package deprecated.stackqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Top {

    public int[] solution(int[] heights) {
        LinkedList<Integer> tops = Arrays.stream(heights)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        LinkedList<Integer> result = new LinkedList<>();
        while (!tops.isEmpty()) {
            int pivotTop = tops.pollLast();
            int size = tops.size();
            int check = result.size();
            for (int i = size - 1; i >= 0; i--) {
                if (pivotTop < tops.get(i)) {
                    result.offerFirst(i + 1);
                    break;
                }
            }
            if (check == result.size()) {
                result.offerFirst(0);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
