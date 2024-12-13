package deprecated.slipp.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {

    public String largestNumber(int[] nums) {

        final int sum = Arrays.stream(nums)
                .sum();
        if (sum == 0) {
            return "0";
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                long basicNumber = Long.parseLong(nums[j - 1] + String.valueOf(nums[j]));
                long comparedNumber = Long.parseLong(nums[j] + String.valueOf(nums[j - 1]));

                if (basicNumber < comparedNumber) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return Arrays.stream(nums)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public List<String> test(List<String> arr) {
        return arr.stream()
                .sorted((o1, o2) -> {
                    if (Integer.valueOf(o2 + o1) > Integer.valueOf(o1 + o2)) {
                        System.out.println(Integer.valueOf(o2 + o1));
                        return 1;
                    } else {
                        String tmp = o1;
                        o1 = o2;
                        o2 = tmp;
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }
}
