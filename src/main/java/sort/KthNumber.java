package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        List<Integer> origin = IntStream.of(array)
                .boxed()
                .collect(Collectors.toList());

        for (final int[] command : commands) {
            List<Integer> elements = new ArrayList<>(origin.subList(command[0] - 1, command[1]));
            elements.sort(Comparator.naturalOrder());
            answer.add(elements.get(command[2] - 1));
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
