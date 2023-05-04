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

    public static void main(String[] args) {
        int n= 10;
        System.out.println(recursive(n));
    }
}
