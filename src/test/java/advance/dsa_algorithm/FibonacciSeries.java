package advance.dsa_algorithm;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    /* formula for this
        f = 0 , s = 1
        t = f + s
        f = s ,  s = t
    */
    // Method 1: Iterative approach (Most efficient)
    public static List<Integer> generateFibonacciIterative(int count) {
        List<Integer> series = new ArrayList<>();

        if (count <= 0) return series;
        series.add(0);
        if (count == 1) return series;
        series.add(1);

        int a = 0, b = 1;
        for (int i = 2; i < count; i++) {
            int c = a + b;
            series.add(c);
            a = b;
            b = c;
        }
        return series;
    }

    // Method 2: Recursive approach with memoization
    public static int fibonacciRecursive(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];

        memo[n] = fibonacciRecursive(n - 1, memo) + fibonacciRecursive(n - 2, memo);
        return memo[n];
    }

    public static List<Integer> generateFibonacciRecursive(int count) {
        List<Integer> series = new ArrayList<>();
        int[] memo = new int[count + 1];

        for (int i = 0; i < count; i++) {
            series.add(fibonacciRecursive(i, memo));
        }
        return series;
    }

    // Method 3: Using only two variables (space optimized)
    public static void printFibonacciOptimized(int count) {
        if (count <= 0) return;

        int a = 0, b = 1;
        System.out.print(a + " ");
        if (count == 1) return;
        System.out.print(b + " ");

        for (int i = 2; i < count; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int count = 10;

        System.out.println("Fibonacci series (Iterative) of " + count + " numbers:");
        System.out.println(generateFibonacciIterative(count));

        System.out.println("\nFibonacci series (Recursive with memoization) of " + count + " numbers:");
        System.out.println(generateFibonacciRecursive(count));

        System.out.println("\nFibonacci series (Space optimized print) of " + count + " numbers:");
        printFibonacciOptimized(count);

        // Additional: Large numbers with BigInteger
        System.out.println("\n\nFibonacci(50) with BigInteger: " + fibonacciBig(50));
    }

    // Bonus: BigInteger implementation for large numbers
    public static java.math.BigInteger fibonacciBig(int n) {
        java.math.BigInteger a = java.math.BigInteger.ZERO;
        java.math.BigInteger b = java.math.BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            java.math.BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return a;
    }
}