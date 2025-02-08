package org.example;

public class RecursiveVsIterative {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }


    public static void main(String[] args) {

        long startTime1 = System.nanoTime();
        int result1 = fibonacciRecursive(30);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by recursion: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        int result2 = fibonacciIterative(30);
        long endTime2 = System.nanoTime();
        System.out.println("Time taken by iteration: " + (endTime2 - startTime2));
    }
}
