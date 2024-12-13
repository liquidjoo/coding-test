package deprecated.stackqueue;

import java.util.*;

public class StockPrice {
    public int[] solution(int[] prices) {
        LinkedList<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (final int price : prices) {
            queue.add(price);
        }

        while (!queue.isEmpty()) {
            int first = queue.removeFirst();
            int index = 0;
            for (int compareNumber : queue) {
                index++;
                if (first > compareNumber) {
                    break;
                }
            }
            result.add(index);
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
