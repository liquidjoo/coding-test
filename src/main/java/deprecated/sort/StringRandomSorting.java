package deprecated.sort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRandomSorting {

    public String[] solution(String[] strings, int n) {
        List<String> answers = Stream.of(strings)
            .sorted((o1, o2) -> {
            if (o1.charAt(n) > o2.charAt(n)) {
                return 1;
            } else if (o1.charAt(n) < o2.charAt(n)) {
                return  -1;
            }
            return o1.compareTo(o2);
        })
            .collect(Collectors.toList());

        return answers.toArray(new String[0]);
    }
}
