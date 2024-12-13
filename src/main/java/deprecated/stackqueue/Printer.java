package deprecated.stackqueue;

import java.util.*;

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
