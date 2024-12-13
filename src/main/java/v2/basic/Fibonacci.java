package v2.basic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static final Map<Integer, Integer> meno = new HashMap<>();

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacci(3);
        System.out.println(result);
    }


    public int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        if (meno.containsKey(n)) {
            return meno.get(n);
        }

        int result = fibonacci(n - 2) + fibonacci(n - 1);
        meno.put(n, result);

        return result;
    }

}
