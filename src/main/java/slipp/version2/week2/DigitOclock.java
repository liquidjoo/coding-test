package slipp.version2.week2;

import slipp.version2.week1.ProductOfArrayExcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DigitOclock {
    public static void main(String... args) {
        final Solution solution = new Solution();
        solution.solution("12:23:44", "13:24:55");

    }

    static class Solution {
        public int solution(String A, String B) {

            Set<String> befores = new HashSet<>();
            Set<String> afters = new HashSet<>();

            final String[] before = A.split(":");
            String beforeHour = before[0];
            String beforeMin = before[1];
            String beforeSec = before[2];

            final String[] after = B.split(":");
            String afterHour = after[0];
            String afterMin = after[1];
            String afterSec = after[2];

            int diffHour = Integer.parseInt(afterHour) - Integer.parseInt(beforeHour);
            int diffMin = Integer.parseInt(afterMin) - Integer.parseInt(beforeMin);
            int diffSecond = Integer.parseInt(afterSec) - Integer.parseInt(beforeSec);
//
//

            return 0;
        }
    }

}
