package slipp.week12;

import java.util.Arrays;

public class FinalPrices {

    public void test() {
        int[] a = {1,2,3,4,5};
        final int[] ints = finalPrices(a);

        System.out.println(Arrays.toString(ints));
    }

    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < prices.length; i++) {

            for (int j =  i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }

            if (result[i] == -1) {
                result[i] = prices[i];
            }
        }

        return result;

    }
}
