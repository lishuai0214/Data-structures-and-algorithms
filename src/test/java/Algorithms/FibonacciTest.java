package Algorithms;

public class FibonacciTest {
    int[] cache = new int[1001];
    public int fib(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else if (cache[n] != 0){
            return cache[n];
        }else {
            cache[n] = fib(n-1) + fib(n-2);
            return cache[n];
        }
    }
}
