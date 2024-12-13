package deprecated.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hindex {
    public int solution(int[] citations) {
        List<Integer> citationsOrdered = Arrays.stream(citations)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < citationsOrdered.size(); i++) {
            int citation = citationsOrdered.get(i);
            int count = (int) citationsOrdered.stream()
                    .filter(integer -> integer >= citation)
                    .count();

            results.add(Math.min(citation, count));
        }

        return results.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException());
    }
}
