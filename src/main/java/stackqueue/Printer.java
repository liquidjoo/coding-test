package stackqueue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Printer {

    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (final int priority : priorities) {
            priorityQueue.add(priority);
        }

        System.out.println(Arrays.toString(priorityQueue.toArray()));
        int answer = 0;
        return answer;

    }

}
