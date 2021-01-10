package naver;

import java.util.Arrays;

public class Task1 {

    public void test() {
//        String[] a = {"zzzz", "ferz", "zdsr", "fgtd"};
//        String[] a = {"gr", "sd", "rg"};
        String[] a = {"bdafg", "ceagi"};
        final int[] solution = solution(a);

        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(String[] S) {
        // write your code in Java SE 8
        String[] words = S;

        int[] result = new int[3];

        for (int i = 0; i < words.length; i++) {

            final char[] word = words[i].toCharArray();

            for (int j = i+1 ; j < words.length; j++) {

                final char[] comparedWord = words[j].toCharArray();

                for (int k = 0; k < word.length ; k++) {
                    if (word[k] == comparedWord[k]) {
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                    }
                }
            }
        }

        if (result[0] == 0 && result[1] == 0 && result[2] == 0) {
            return new int[0];
        }

        return result;
    }

}
