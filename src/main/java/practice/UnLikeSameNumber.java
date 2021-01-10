package practice;

import java.util.*;
import java.util.stream.Collectors;

public class UnLikeSameNumber {

    public int[] solution(int []arr) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                numbers.add(arr[i]);
            }
        }

        return numbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
