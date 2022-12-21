package com.rits.basics.recursion;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 06/06/22
 */
public class FibonaciSeries {
    static int fib(int n){
        int t0=0,t1=1,s=0;
        if (n<=1){
            return n;
        }
        for (int i = 1; i < n; i++) {
            s=t0+t1;
            t0=t1;
            t1=s;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));

    }
}
