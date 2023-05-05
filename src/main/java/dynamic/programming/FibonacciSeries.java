package dynamic.programming;

import java.util.Arrays;
public class FibonacciSeries {
    public static int  recursive(int n){
        if(n <= 1)
            return n;
        int x = recursive(n-1);
        int y = recursive(n-2);
        return x+y;
    }

    public static int topDownMemoizatio(int n, int[] dp){
       if(n <= 1)
           return n;
       if(dp[n] != Integer.MIN_VALUE)
           return dp[n];

       int x = topDownMemoizatio(n-1, dp);
       int y = topDownMemoizatio(n-2, dp);
       return dp[n] = x+y;
    }

    public static int bottomUpTabulation(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static int spaceOptimizedBottomUp(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }


    public static void main(String[] args) {
        int n= 10;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        System.out.println(recursive(n));
        System.out.println(topDownMemoizatio(n, dp));
        System.out.println(bottomUpTabulation(n));
        System.out.println(spaceOptimizedBottomUp(n));

    }
}
