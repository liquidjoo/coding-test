package deprecated.naver;

import java.util.*;
import java.util.stream.IntStream;

public class Task2 {

    public void test() {
//        int a[] = {4,4,2,4};
//        int b[] = {5,5,2,5};

        int a[] = {2,3,4,2};
        int b[] = {2,5,7,2};

        final int solution = solution(a,b);

        System.out.println(solution);
    }

    public int solution(int[] P, int[] S) {
        // write your code in Java SE 8
        int carCount = S.length;
        int peopleCount = IntStream.of(P).sum();

        Arrays.sort(S);

        for (int i = S.length - 1; i >= 0; i--) {
            peopleCount = peopleCount - S[i];

            if (peopleCount <= 0) {
                return carCount - i;
            }
        }

        return carCount;

    }

}
